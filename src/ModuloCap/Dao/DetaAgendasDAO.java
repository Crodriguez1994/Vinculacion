/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Dao;

import Listener.EntityMF;
import ModuloCap.Entidades.DetaAgendas;
import ModuloCap.InterfacesDao.IDetaAgendasDao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Christian
 */
public class DetaAgendasDAO implements IDetaAgendasDao {

    @Override
    public DetaAgendas getDetAgendasId(int detagendapk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Guardar(DetaAgendas detagenda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Modificar(DetaAgendas detagenda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar(DetaAgendas detagenda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DetaAgendas> getDetAgendaslist() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DetaAgendas> getDetAgendaslist(int cabagendaid) {
        EntityManager em = null;
        List<DetaAgendas> listaDetaAgenda = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery query = em.createNamedQuery("DetaAgendas.findByCabagendaid", DetaAgendas.class);
            query.setParameter("cabagendaid", cabagendaid);
            listaDetaAgenda = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex);
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listaDetaAgenda;
    }
    
}
