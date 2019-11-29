/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Dao;

import Listener.EntityMF;
import ModuloCap.Entidades.CabHorarios;
import ModuloCap.InterfacesDao.ICabHorariosDao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Christian
 */
public class CabHorariosDAO implements ICabHorariosDao {

   
    @Override
    public CabHorarios getCabhorariosId(int cabhorarioid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Guardar(CabHorarios cabhorario) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            em.persist(cabhorario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex);
            throw ex;
        } finally {
            if (em != null) {
                System.out.println("Registro Exitoso!");
                em.close();
            }
        }
    }

    @Override
    public void Modificar(CabHorarios cabhorario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar(CabHorarios cabhorario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CabHorarios> getCabhorarioslist() {
        EntityManager em = null;
        List<CabHorarios> listacabhorarios = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            Query query = em.createNamedQuery("CabHorarios.findAll");
            listacabhorarios = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex);
            throw ex;
        }finally{
            if (em != null) {
                em.close();
            }
        }
        return listacabhorarios;
        
    }

}
