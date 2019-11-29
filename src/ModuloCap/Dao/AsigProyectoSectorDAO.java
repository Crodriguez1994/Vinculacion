/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Dao;

import Listener.EntityMF;
import ModuloCap.Entidades.AsigProyectoSector;
import ModuloCap.InterfacesDao.IAsigProyectoSectorDao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Christian
 */
public class AsigProyectoSectorDAO implements IAsigProyectoSectorDao {

    @Override
    public AsigProyectoSector getAsigProyectoId(int asigproyectosectorid) {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Guardar(AsigProyectoSector asigproyectosector) {
     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public void Modificar(AsigProyectoSector asigproyectosector) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar(AsigProyectoSector asigproyectosector) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AsigProyectoSector> getAsigProyectosSectorlist() {
        EntityManager em = null;
        List<AsigProyectoSector> listaasigproyecto = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("AsigProyectoSector.findAll", AsigProyectoSector.class);
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
    public List<AsigProyectoSector> getAsigProyectosBySector(int sectorId) {
        EntityManager em = null;
        List<AsigProyectoSector> listaasigproyecto = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("AsigProyectoSector.findBySectorid", AsigProyectoSector.class);
            query.setParameter("sectorid", sectorId);
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
    public List<AsigProyectoSector> getAsigProyectosByProyecto(int proyectoId) {
        EntityManager em = null;
        List<AsigProyectoSector> listaasigproyecto = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("AsigProyectoSector.findByProyectoid", AsigProyectoSector.class);
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
