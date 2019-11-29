/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Dao;

import Listener.EntityMF;
import ModuloCap.Entidades.Beneficiarios;
import java.util.List;
import ModuloCap.InterfacesDao.IBeneficiariosDao;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Christian
 */
public class BeneficiariosDAO implements IBeneficiariosDao {

    @Override
    public Beneficiarios getBeneficiarioId(int beneficiarioid) {
        EntityManager em = null;
        Beneficiarios beneficiario = null;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery q = em.createNamedQuery("Beneficiarios.findByBeneficiarioid", Beneficiarios.class);
            q.setParameter("beneficiarioid", beneficiarioid);
            if (q.getResultList().size() == 1) {
                beneficiario = (Beneficiarios) q.getSingleResult();
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
        return beneficiario;
    }

    @Override
    public void Guardar(Beneficiarios beneficiario) {
        EntityManager em = null;
        beneficiario.setBeneficiarioid(getNextId());        
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            em.persist(beneficiario);
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
    public void Modificar(Beneficiarios beneficiario) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            em.getReference(Beneficiarios.class, beneficiario.getBeneficiarioid());
            em.getTransaction().begin();
            em.merge(beneficiario);/*merge -> Actualizar*/
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
    public void Eliminar(Beneficiarios beneficiario) {
        EntityManager em = null;
        try {
            em = EntityMF.getEntityManager();
            Beneficiarios beneficia = em.getReference(Beneficiarios.class, beneficiario.getBeneficiarioid());
            em.getTransaction().begin();
            em.remove(beneficia);
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
    public List<Beneficiarios> getBeneficiariolist() {
        EntityManager em = null;
        List<Beneficiarios> listabeneficiario = new ArrayList<>();
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            Query query = em.createNamedQuery("Beneficiarios.findAll");
            listabeneficiario = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listabeneficiario;
    }

    @Override
    public int getNextId() {
        EntityManager em = null;
        int id = 1;
        try {
            em = EntityMF.getEntityManager();
            em.getTransaction().begin();
            TypedQuery q = em.createNamedQuery("Beneficiarios.getNextId", Integer.class);
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
