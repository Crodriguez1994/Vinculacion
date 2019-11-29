/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Dao;

import Listener.EntityMF;
import ModuloCap.Entidades.Especialidades;
import ModuloCap.InterfacesDao.IEspecialidadesDao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Christian
 */
public class EspecialidadesDAO implements IEspecialidadesDao {

    @Override
    public Especialidades getEspecialidadesId(int especialidadid) {
        EntityManager em = null;
        Especialidades esp = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery q = em.createNamedQuery("CapEspecialidades.findByEspecialidadid", Especialidades.class);
            q.setParameter("especialidadid", especialidadid);
            if (q.getResultList().size() == 1) {
                esp = (Especialidades) q.getSingleResult();
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
        return esp;
    }

    @Override
    public void Guardar(Especialidades especialidad) {
        EntityManager em = null;
        especialidad.setEspecialidadid(getNextId());
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            em.persist(especialidad);
            em.getTransaction().commit();
            System.out.println("Registro Exitoso!");
        } catch (Exception ex) {
            System.out.println("Error" + ex);
            throw ex;
        } finally {
            if (em != null) {
                //System.out.println("Registro Exitoso!");
                em.close();
            }
        }
    }

    @Override
    public void Modificar(Especialidades especialidad) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            em.getReference(Especialidades.class, especialidad.getEspecialidadid());
            em.getTransaction().begin();
            em.merge(especialidad);/*merge -> Actualizar*/
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
    public void Eliminar(Especialidades especialidad) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            Especialidades espe = em.getReference(Especialidades.class,especialidad.getEspecialidadid());
            em.getTransaction().begin();
            em.remove(espe);
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
    public List<Especialidades> getEspecialidadeslist() {
        EntityManager em = null;
        List<Especialidades> listaespecialidades = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            Query query = em.createNamedQuery("Especialidades.findAll");
            listaespecialidades = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex);
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listaespecialidades;
    }

    @Override
    public int getNextId() {
        EntityManager em = null;
        int id = 1;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery q = em.createNamedQuery("Especialidades.getNextId", Integer.class);
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
