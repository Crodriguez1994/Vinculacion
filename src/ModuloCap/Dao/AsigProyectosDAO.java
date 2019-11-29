/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Dao;

import Listener.EntityMF;
import ModuloCap.Entidades.AsigProyectos;
import java.util.List;
import ModuloCap.InterfacesDao.IAsigProyectosDao;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Christian
 */
public class AsigProyectosDAO implements IAsigProyectosDao {

    @Override
    public AsigProyectos getAsigProyectoId(int asigproyectoid) {
        EntityManager em = null;
        AsigProyectos asp = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("AsigProyectos.findByAsigproyectoid", AsigProyectos.class);
            query.setParameter("asigproyectoid", asigproyectoid);
            if (query.getResultList().size() == 1) {
                asp = (AsigProyectos) query.getSingleResult();
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
        return asp;
    }

    @Override
    public void Guardar(AsigProyectos asigproyecto) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            em.persist(asigproyecto);
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
    public void Modificar(AsigProyectos asigproyecto) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            em.getReference(AsigProyectos.class, asigproyecto.getAsigproyectoid());
            em.getTransaction().begin();
            em.merge(asigproyecto);/*merge -> Actualizar*/
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
    public void Eliminar(AsigProyectos asigproyecto) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            AsigProyectos as = em.getReference(AsigProyectos.class, asigproyecto.getAsigproyectoid());
            em.getTransaction().begin();
            em.remove(as);
            System.out.println("Datos eliminado Exitosamente!");
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
    public List<AsigProyectos> getAsigProyectoslist() {
        EntityManager em = null;
        List<AsigProyectos> listaasigproyecto = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("AsigProyectos.findAll", AsigProyectos.class);
            listaasigproyecto = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex);
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listaasigproyecto;
    }

    @Override
    public List<AsigProyectos> getAsigProyectosByCoordinador(int coordinadorId) {
        EntityManager em = null;
        List<AsigProyectos> listaasigproyecto = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("AsigProyectos.findByCoordinadorid", AsigProyectos.class);
            query.setParameter("coordinadorid", coordinadorId);
            listaasigproyecto = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex);
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listaasigproyecto;
    }

    @Override
    public List<AsigProyectos> getAsigProyectosByProyecto(int proyectoId) {
        EntityManager em = null;
        List<AsigProyectos> listaasigproyecto = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("AsigProyectos.findByProyectoid", AsigProyectos.class);
            query.setParameter("proyectoid", proyectoId);
            listaasigproyecto = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex);
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listaasigproyecto;
    }

}
