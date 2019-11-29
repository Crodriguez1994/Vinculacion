/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Dao;

import Listener.EntityMF;
import ModuloCap.Entidades.CabCapacitaciones;
import ModuloCap.InterfacesDao.ICabCapacitacionesDao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Christian
 */
public class CabCapacitacionesDAO implements ICabCapacitacionesDao {


    @Override
    public CabCapacitaciones getcabcapactacionId(int cabcapacitacionid) {
        EntityManager em = null;
        CabCapacitaciones capacitacion = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("CabCapacitaciones.findByCabcapid", CabCapacitaciones.class);
            query.setParameter("cabcapid", cabcapacitacionid);
            if (query.getResultList().size() == 1) {
                capacitacion = (CabCapacitaciones) query.getSingleResult();
            } else {
                System.out.println("Nose encontro el Dato!");
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return capacitacion;
    }

    @Override
    public void Guardar(CabCapacitaciones cabcapacitacion) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            em.persist(cabcapacitacion);
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
    public void Modificar(CabCapacitaciones cabcapacitacion) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            em.find(CabCapacitaciones.class, cabcapacitacion.getCabcapid());
            em.merge(cabcapacitacion);
            em.getTransaction().commit();
            System.out.println("Dato Modificado correctamente!");
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
    public void Eliminar(CabCapacitaciones cabcapacitacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CabCapacitaciones> getCabcapacitacioneslist() {
        EntityManager em = null;
        List<CabCapacitaciones> listcabcap = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("CabCapacitaciones.findAll",CabCapacitaciones.class);
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
