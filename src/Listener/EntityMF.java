/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listener;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author armis
 */
public class EntityMF {

    private static EntityManagerFactory emf;

    private EntityMF() {
    }

    public static void InicializarEMF() {
        emf = Persistence.createEntityManagerFactory("CapaDatosCapNurtacPU");
    }

    public static void CerrarEMF() {
        if (emf != null) {
            emf.close();
        }
    }

    public static EntityManager getEntityManager() {
        if (emf != null) {
            return emf.createEntityManager();
        }
        return null;
    }

}
