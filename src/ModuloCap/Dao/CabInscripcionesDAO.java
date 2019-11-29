/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Dao;

import Listener.EntityMF;
import ModuloCap.Entidades.CabInscripciones;
import ModuloCap.InterfacesDao.ICabInscripcionesDao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Christian
 */
public class CabInscripcionesDAO implements ICabInscripcionesDao {

   
    @Override
    public CabInscripciones getCabinscripciones(int cabinscripcionid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Guardar(CabInscripciones cabinscripcion) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            em.persist(cabinscripcion);
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
    public void Modificar(CabInscripciones cabinscripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar(CabInscripciones cabinscripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CabInscripciones> getCabinscripcioneslist() {
        EntityManager em = null;
        List<CabInscripciones> listcabcap = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("CabInscripciones.findAll",CabInscripciones.class);
            listcabcap = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex);
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listcabcap;
    }
 
}
