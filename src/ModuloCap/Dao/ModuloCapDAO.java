/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Dao;

import Listener.EntityMF;
import ModuloCap.Entidades.ModulosCapacitaciones;
import ModuloCap.InterfacesDao.IModuloCapDao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Christian
 */
public class ModuloCapDAO implements IModuloCapDao{

    @Override
    public ModulosCapacitaciones getModulocapId(int modulocapPk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Guardar(ModulosCapacitaciones moduloscap) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Modificar(ModulosCapacitaciones moduloscap) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar(ModulosCapacitaciones moduloscap) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModulosCapacitaciones> getModulocaplist() {
         EntityManager em = null;
        List<ModulosCapacitaciones> listamodulos = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("ModulosCapacitaciones.findAll", ModulosCapacitaciones.class);
            listamodulos = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listamodulos;
    }

    @Override
    public List<ModulosCapacitaciones> getModulocaplist(int cabcapid, int modulocapid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModulosCapacitaciones> getModuloByCabCap(int cabcapid) {
        EntityManager em = null;
        List<ModulosCapacitaciones> listamodulos = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("ModulosCapacitaciones.findByCabcapid", ModulosCapacitaciones.class);
            query.setParameter("cabcapid", cabcapid);
            listamodulos = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listamodulos;
    }
    
}
