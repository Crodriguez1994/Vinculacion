/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capanegociocapnurtac;

import Listener.EntityMF;

/**
 *
 * @author Christian
 */
public class CapaNegocioCapNurtac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityMF.InicializarEMF();
      
        EntityMF.CerrarEMF();

    }

}
