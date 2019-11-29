/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Dao;

import Listener.EntityMF;
import ModuloCap.Entidades.Facilitadores;
import ModuloCap.InterfacesDao.IFacilitadoresDao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Christian
 */
public class FacilitadoresDAO implements IFacilitadoresDao{

    @Override
    public Facilitadores getFacilitadoresId(int facilitadorid) {
        EntityManager em = null;
        Facilitadores fa = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery q = em.createNamedQuery("Facilitadores.findByFacilitadorid", Facilitadores.class);
            q.setParameter("facilitadorid", facilitadorid);
            if (q.getResultList().size() == 1) {
                fa = (Facilitadores) q.getSingleResult();
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
        return fa;
    }

    @Override
    public void Guardar(Facilitadores facilitador) {
        EntityManager em = null;
        facilitador.setFacilitadorid(getNextId());
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            em.persist(facilitador);
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
    public void Modificar(Facilitadores facilitadores) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            em.getReference(Facilitadores.class, facilitadores.getFacilitadorid());
            em.getTransaction().begin();
            em.merge(facilitadores);/*merge -> Actualizar*/
            em.getTransaction().commit();
            System.out.println("Modificacion Exitosa!");
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void Eliminar(Facilitadores facilitador) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            Facilitadores facilit = em.getReference(Facilitadores.class, facilitador.getFacilitadorid());
            em.getTransaction().begin();
            em.remove(facilit);
            em.getTransaction().commit();
            System.out.println("Datos eliminado Exitosamente!");
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public List<Facilitadores> getFacilitadoreslist() {
        EntityManager em = null;
        List<Facilitadores> listafaci = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            Query query = em.createNamedQuery("Facilitadores.findAll");
            listafaci = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex);
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listafaci;
    }

    @Override
    public int getNextId() {
        EntityManager em = null;
        int id = 1;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery q = em.createNamedQuery("Facilitadores.getNextId", Integer.class);
            if (q.getSingleResult() != null) {
                id = (int) q.getSingleResult();
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
        return id;
    }
    
}
