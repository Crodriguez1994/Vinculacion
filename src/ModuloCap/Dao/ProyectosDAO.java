/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Dao;

import Listener.EntityMF;
import ModuloCap.Entidades.Proyectos;
import ModuloCap.InterfacesDao.IProyectosDao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Christian
 */
public class ProyectosDAO implements IProyectosDao {

    @Override
    public Proyectos getProyectosId(int proyectoid) {
        EntityManager em = null;
        Proyectos proyecto = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("Proyectos.findByProyectoid", Proyectos.class);
            query.setParameter("proyectoid", proyectoid);
            if (query.getResultList().size() == 1) {
                proyecto = (Proyectos) query.getSingleResult();
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
        return proyecto;
    }

    @Override
    public void Guardar(Proyectos proyecto) {
        EntityManager em = null;
        proyecto.setProyectoid(getNextId());
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            em.persist(proyecto);
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
    public void Modificar(Proyectos proyecto) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            em.find(Proyectos.class, proyecto.getProyectoid());
            em.merge(proyecto);/*merge -> Actualizar*/
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
    public void Eliminar(Proyectos proyecto) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            Proyectos pro = em.find(Proyectos.class, proyecto.getProyectoid());
            em.remove(pro);
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
    public List<Proyectos> getProyectoslist() {
        EntityManager em = null;
        List<Proyectos> listaproyectos = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("Proyectos.findAll", Proyectos.class);
            listaproyectos = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listaproyectos;

    }

    @Override
    public int getNextId() {
        EntityManager em = null;
        int id = 1;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("Proyectos.getNextId", Integer.class);
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
    public List<Proyectos> getProyectosById(int proyectoId) {
        EntityManager em = null;
        List<Proyectos> listaproyectos = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("Proyectos.findByProyectoid", Proyectos.class);
            query.setParameter("proyectoid", proyectoId);
            listaproyectos = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listaproyectos;
    }

}
