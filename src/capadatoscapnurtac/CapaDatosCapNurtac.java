/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capadatoscapnurtac;

import Listener.EntityMF;
import ModuloCap.Beans.PruebasBeans;

/**
 *
 * @author Christian
 */
public class CapaDatosCapNurtac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityMF.InicializarEMF();
        PruebasBeans pbeans = new PruebasBeans();

        //pbeans.IngresarProyectos();
        //pbeans.ModificarProyectos();
        //pbeans.EliminarProyectos();
        //pbeans.ListaProyectos();
        //pbeans.IngresarSectores();
        //pbeans.EliminarSectores();
        //pbeans.IngresarUndAtencion();
        //pbeans.ModificarUndAtencon();
        //pbeans.EliminarUndAtencion();
        //pbeans.ListaUndAtencion();
        //pbeans.IngresarEspecialidad();
        //pbeans.IngresarFacilitador();
        //pbeans.ListaFacilitador();
        //pbeans.IngresarCoordinador();
        //pbeans.IngresarAsigProyectos();
        //pbeans.ListaAsigProyectos();
        //pbeans.IngresarCabCapacitacion();
        //pbeans.ListaCabCapacitacion();
        //pbeans.ListaProyectoSector();
        //pbeans.IngresarAgenda();
        EntityMF.CerrarEMF();
    }

}
