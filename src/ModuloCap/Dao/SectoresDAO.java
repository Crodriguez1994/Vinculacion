/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Dao;

import Listener.EntityMF;
import ModuloCap.Entidades.Sectores;
import ModuloCap.InterfacesDao.ISectoresDao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Christian
 */
public class SectoresDAO implements ISectoresDao {

    @Override
    public void Guardar(Sectores sector) {
        EntityManager em = null;
        sector.setSectorid(getNextId());
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            em.persist(sector);
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
    public void Modificar(Sectores sector) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            em.find(Sectores.class, sector.getSectorid());
            em.getTransaction().begin();
            em.merge(sector);/*merge -> Actualizar*/
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
    public void Eliminar(Sectores sector) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            Sectores sec = em.find(Sectores.class, sector.getSectorid());
            em.getTransaction().begin();
            em.remove(sec);
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
    public Sectores getSectoresId(int sectorid) {
        EntityManager em = null;
        Sectores sector = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("Sectores.findBySectorid", Sectores.class);
            query.setParameter("sectorid", sectorid);
            if (query.getResultList().size() == 1) {
                sector = (Sectores) query.getSingleResult();
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
        return sector;
    }

    @Override
    public List<Sectores> getSectoreslist() {
        EntityManager em = null;
        List<Sectores> listasectores = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("Sectores.findAll",Sectores.class);
            listasectores = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listasectores;

    }

    @Override
    public int getNextId() {
        EntityManager em = null;
        int id = 1;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("Sectores.getNextId", Integer.class);
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
    public List<Sectores> getSectoresById(int sectorId) {
         EntityManager em = null;
        List<Sectores> listasectores = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("Sectores.findAll",Sectores.class);
            query.setParameter("sectorid", sectorId);
            listasectores = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listasectores;
    }

}
