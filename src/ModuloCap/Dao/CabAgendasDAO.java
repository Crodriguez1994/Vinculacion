/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Dao;

import Listener.EntityMF;
import ModuloCap.Entidades.CabAgendas;
import ModuloCap.InterfacesDao.ICabAgendasDao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Christian
 */
public class CabAgendasDAO implements ICabAgendasDao {

    @Override
    public CabAgendas getCabagendasId(int cabagendaid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Guardar(CabAgendas cabagenda) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            em.persist(cabagenda);
            System.out.println("AVISO 2 " +cabagenda.toString());
            em.getTransaction().commit();
            System.out.println("Registro Exitoso!");
        } catch (Exception ex) {
            System.out.println("Error" + ex);
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void Modificar(CabAgendas cabagenda) {
         EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            em.merge(cabagenda);
            em.getTransaction().commit();
            System.out.println("Dato Modificado Correctamente!");
        } catch (Exception ex) {
            System.out.println("Error" + ex);
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void Eliminar(CabAgendas cabagenda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CabAgendas> getCabagendaslist() {
        EntityManager em = null;
        List<CabAgendas> listaagend = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("CabAgendas.findAll",CabAgendas.class);
            listaagend = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex);
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listaagend;
    }

}
