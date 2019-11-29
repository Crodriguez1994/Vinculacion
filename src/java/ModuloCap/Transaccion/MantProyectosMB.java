/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Transaccion;

import ModuloCap.Data.MantProyectosDataMB;
import Modelo.Mantenedores.Proyecto;
import Modelo.Mantenedores.ProyectoSector;
import Modelo.Mantenedores.Sector;
import ModuloCap.Facade.FacadeMantProyectos;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Christian
 */
@Named
@ViewScoped
public class MantProyectosMB implements Serializable {

    @Inject
    private MantProyectosDataMB proyectoData;
    private FacadeMantProyectos proyectoFacade;

    @PostConstruct
    public void Init() {
        accionNuevo();
        proyectoFacade = new FacadeMantProyectos();
        proyectoData.setListaProyectos(proyectoFacade.GetAllProyectos());
        proyectoData.setListaAsig(proyectoFacade.GetAllAsigProyectoSector());
        proyectoData.setListaSe(proyectoFacade.GetAllSectores());

    }

    public MantProyectosMB() {

    }

    public MantProyectosDataMB getProyectoData() {
        return proyectoData;
    }

    public void setProyectoData(MantProyectosDataMB proyectoData) {
        this.proyectoData = proyectoData;
    }

    //<editor-fold defaultstate="collapsed" desc="ACCIONES DEL MANTENIMEINTO PROYECTO">
    public void accionGuardar() {
        accionSeleccionarSector();
        proyectoFacade.GuardarProyecto(proyectoData.getProyeto(),proyectoData.getListaAux());
        proyectoData.setListaProyectos(proyectoFacade.GetAllProyectos());
        accionNuevo();
    }

    public void accionSeleccionar() {
        if (proyectoData.getSeleccionarP() != null) {
            Proyecto p = proyectoData.getSeleccionarP();
            proyectoData.setProyeto(p);
        }
        Proyecto pr = proyectoData.getProyeto();
        proyectoData.setListaAsig(proyectoFacade.GetAsigByProyecto(pr.getProyectoid()));
    }

    public void accionSeleccionarSector() {
        for (Sector s : proyectoData.getListaSe()) {
            if (s.isSeleccion()) {
                proyectoData.getListaAux().add(s);
            }
        }
    }

    public void accionNuevo() {
        proyectoData.setProyeto(new Proyecto());
        proyectoData.getProyeto().setEstado("Activo");
        proyectoData.getProyeto().setFecha(new Date());

        proyectoData.setAsigSector(new ProyectoSector());
        proyectoData.setSector(new Sector());
    }

    //</editor-fold>
}
