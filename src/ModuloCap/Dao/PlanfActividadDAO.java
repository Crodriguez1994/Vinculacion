/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Dao;

import Listener.EntityMF;
import ModuloCap.Entidades.PlanificacionActividades;
import ModuloCap.InterfacesDao.IPlanfActividadDao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Christian
 */
public class PlanfActividadDAO implements IPlanfActividadDao {

    @Override
    public PlanificacionActividades getPlanfActividadesId(int PlanfId) {
        EntityManager em = null;
        PlanificacionActividades planificacion = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery q = em.createNamedQuery("PlanificacionActividades.findByPlanificacionid", PlanificacionActividades.class);
            q.setParameter("planificacionid", PlanfId);
            if (q.getResultList().size() == 1) {
                planificacion = (PlanificacionActividades) q.getSingleResult();
            }else{
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
        return planificacion;
        
    }

    @Override
    public void Guardar(PlanificacionActividades planfActividad) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            em.persist(planfActividad);
            System.out.println("Registro Exitoso!");
            em.getTransaction().commit();
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
    public void Modificar(PlanificacionActividades planfActividad) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            em.find(PlanificacionActividades.class, planfActividad.getPlanificacionid());
            em.merge(planfActividad);/*merge -> Actualizar*/
            System.out.println("Modificacion Exitosa!");
            em.getTransaction().commit();
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
    public void Eliminar(PlanificacionActividades planfActividad) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            PlanificacionActividades planifi = em.find(PlanificacionActividades.class, planfActividad.getPlanificacionid());
            em.remove(planifi);
            System.out.println("Dato eliminado Exitosamente!");
            em.getTransaction().commit();
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
    public List<PlanificacionActividades> getPlanfActividadeslist() {
        EntityManager em = null;
        List<PlanificacionActividades> listaplani = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("PlanificacionActividades.findAll",PlanificacionActividades.class);
            listaplani = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listaplani;
    }
    
}
