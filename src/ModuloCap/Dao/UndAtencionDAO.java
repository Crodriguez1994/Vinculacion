/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Dao;

import Listener.EntityMF;
import ModuloCap.Entidades.UnidadesAtencion;
import ModuloCap.InterfacesDao.IUndAtencionDao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Christian
 */
public class UndAtencionDAO implements IUndAtencionDao {

    @Override
    public void Guardar(UnidadesAtencion undatencion) {
        EntityManager em = null;
        undatencion.setUnidadid(getNextId());
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            em.persist(undatencion);
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
    public void Modificar(UnidadesAtencion undatencion) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            em.getReference(UnidadesAtencion.class, undatencion.getUnidadid());
            em.getTransaction().begin();
            em.merge(undatencion);/*merge -> Actualizar*/
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
    public void Eliminar(UnidadesAtencion undatencion) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            UnidadesAtencion undA = em.getReference(UnidadesAtencion.class, undatencion.getUnidadid());
            em.getTransaction().begin();
            em.remove(undA);
            em.getTransaction().commit();
            System.out.println("Dato eliminado Exitosamente!");
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
    public UnidadesAtencion getUndAtencionId(int undatencionid) {
        EntityManager em = null;
        UnidadesAtencion undAtencion = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("UnidadesAtencion.findByUnidadid", UnidadesAtencion.class);
            query.setParameter("undatencionid", undatencionid);
            if (query.getResultList().size() == 1) {
                undAtencion = (UnidadesAtencion) query.getSingleResult();
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
        return undAtencion;
    }

    @Override
    public List<UnidadesAtencion> getUndAtencionList() {
        EntityManager em = null;
        List<UnidadesAtencion> listaunidaten = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("UnidadesAtencion.findAll", UnidadesAtencion.class);
            listaunidaten = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex);
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listaunidaten;
    }

    @Override
    public int getNextId() {
        EntityManager em = null;
        int id = 1;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("UnidadesAtencion.getNextId", Integer.class);
            if (query.getSingleResult() != null) {
                id = (int) query.getSingleResult();
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

    @Override
    public List<UnidadesAtencion> getUndAtencionByProyecto(int proyectoId) {
        EntityManager em = null;
        List<UnidadesAtencion> listaunidaten = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("UnidadesAtencion.findByProyectoid", UnidadesAtencion.class);
            query.setParameter("proyectoid", proyectoId);
            listaunidaten = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex);
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listaunidaten;
    }

    @Override
    public List<UnidadesAtencion> getUndAtencionBySector(int sectorId) {
        EntityManager em = null;
        List<UnidadesAtencion> listaunidaten = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("UnidadesAtencion.findBySectorid", UnidadesAtencion.class);
            query.setParameter("sectorid", sectorId);
            listaunidaten = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex);
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listaunidaten;
    }

}
