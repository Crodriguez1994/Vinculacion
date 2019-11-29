/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Dao;

import Listener.EntityMF;
import ModuloCap.Entidades.Coordinadores;
import ModuloCap.InterfacesDao.ICoordinadoresDao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Christian
 */
public class CoordinadoresDAO implements ICoordinadoresDao {

    @Override
    public Coordinadores getCoordinadorId(int coordinadorid) {
        EntityManager em = null;
        Coordinadores coord = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery q = em.createNamedQuery("Coordinadores.findByCoordinadorid", Coordinadores.class);
            q.setParameter("coordinadorid", coordinadorid);
            if (q.getResultList().size() == 1) {
                coord = (Coordinadores) q.getSingleResult();
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
        return coord;
    }

    @Override
    public void Guardar(Coordinadores coordinador) {
        EntityManager em = null;
        coordinador.setCoordinadorid(getNextId());
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            em.persist(coordinador);
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
    public void Modificar(Coordinadores coordinador) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            em.find(Coordinadores.class, coordinador.getCoordinadorid());
            em.getTransaction().begin();
            em.merge(coordinador);/*merge -> Actualizar*/
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
    public void Eliminar(Coordinadores coordinador) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            Coordinadores coor = em.find(Coordinadores.class, coordinador.getCoordinadorid());
            em.getTransaction().begin();
            em.remove(coor);
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
    public List<Coordinadores> getCoordinadoreslist() {
        EntityManager em = null;
        List<Coordinadores> listascoordinador = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("Coordinadores.findAll", Coordinadores.class);
            listascoordinador = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listascoordinador;

    }

    @Override
    public int getNextId() {
        EntityManager em = null;
        int id = 1;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery q = em.createNamedQuery("Coordinadores.getNextId", Integer.class);
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

    @Override
    public List<Coordinadores> getCoordinadoresById(int coordinadorId) {
        EntityManager em = null;
        List<Coordinadores> listascoordinador = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("Coordinadores.findByCoordinadorid", Coordinadores.class);
            query.setParameter("coordinadorid", coordinadorId);
            listascoordinador = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listascoordinador;
    }

}
