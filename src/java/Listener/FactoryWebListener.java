/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author HewPack
 */
@WebListener
public class FactoryWebListener implements ServletContextListener {

    public FactoryWebListener() {
    }
   
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        EntityMF.InicializarEMF();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        EntityMF.CerrarEMF();
    }
   
}
