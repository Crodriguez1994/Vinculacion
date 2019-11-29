/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Dao;

import Listener.EntityMF;
import ModuloCap.Entidades.CabCapacitaciones;
import ModuloCap.Entidades.DetaCapacitaciones;
import ModuloCap.Entidades.DetaCapacitacionesPK;
import ModuloCap.InterfacesDao.IDetaCapacitacionesDao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Christian
 */
public class DetaCapacitacionesDAO implements IDetaCapacitacionesDao {

    @Override
    public void Guardar(DetaCapacitaciones detacapacitacion) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            Query q = em.createNamedQuery("DetaCapacitaciones.findByCabcapid");
            List<CabCapacitaciones> list = (List<CabCapacitaciones>) q.getResultList();
            for(CabCapacitaciones cab : list){
                em.refresh(cab);
            }
            em.persist(detacapacitacion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex);
            throw ex;
        } finally {
            if (em != null) {
                System.out.println("Registro Exitoso!");
                em.close();
            }
        }
    }
    
    @Override
    public void modificar(DetaCapacitaciones detacapacitacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar(DetaCapacitaciones detacapacitacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DetaCapacitaciones> getDetacapacitacioneslist() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DetaCapacitaciones> getDetacapacitacioneslist(DetaCapacitacionesPK detacapacitacionesPk) {
        EntityManager em = null;
        List<DetaCapacitaciones> listadetacap = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            Query query = em.createNamedQuery("DetaCapacitaciones.findByCabcapid", Object.class);
            listadetacap = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex);
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listadetacap;
    }

    @Override
    public DetaCapacitacionesPK getCapCapacitacionesId() {
        EntityManager em = null;
        DetaCapacitacionesPK detaCap = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery q = em.createNamedQuery("DetaCapacitaciones.findByCabcapid", Integer.class);
            if (q.getSingleResult() != null) {
                detaCap = em.find(DetaCapacitacionesPK.class, detaCap.getCabcapid());
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
        return detaCap;
    }

}
