/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Transaccion;

import Modelo.Mantenedores.Coordinador;
import Modelo.Mantenedores.Proyecto;
import Modelo.Procesos.AsignacionProyecto;
import ModuloCap.Data.MantAsigProyectoDataMB;
import ModuloCap.Facade.FacadeMantAsignacionProyectos;
import ModuloCap.Facade.IFacadeMantAsignacionProyectos;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Christian
 */
@Named
@ViewScoped
public class MantAsigProyectoMB implements Serializable {

    @Inject
    private MantAsigProyectoDataMB asigproyectoData;
    private IFacadeMantAsignacionProyectos asigProyectoFacade;

    @PostConstruct
    public void init() {
        accionInicializar();
        asigProyectoFacade = new FacadeMantAsignacionProyectos();
        asigproyectoData.setListaCoordinador(asigProyectoFacade.GetAllCoordinadores());
        asigproyectoData.setListaProyectos(asigProyectoFacade.GetAllProyectos());
    }

    public MantAsigProyectoDataMB getAsigproyectoData() {
        return asigproyectoData;
    }

    public void setAsigproyectoData(MantAsigProyectoDataMB asigproyectoData) {
        this.asigproyectoData = asigproyectoData;
    }

    public void accionGuardar() {
        FacesContext context = FacesContext.getCurrentInstance();
        seleccionarCoordinador();
        seleccionarProyecto();
        asigproyectoData.getAsigProyecto().setCoordinadorid(asigproyectoData.getCoordinador());
        asigProyectoFacade.Guardar(asigproyectoData.getAsigProyecto(), asigproyectoData.getListaAyuda());
        context.addMessage(null, new FacesMessage("Accion", "Registro Exitoso!"));
        accionNuevo();
    }

    public void seleccionarCoordinador() {
        if (asigproyectoData.getSeleccionCo() != null) {
            Coordinador coordinador = asigproyectoData.getSeleccionCo();
            asigproyectoData.setCoordinador(coordinador);
        }
    }

    public void seleccionarProyecto() {
        for (Proyecto proyecto : asigproyectoData.getListaProyectos()) {
            if (proyecto.isSeleccionar()) {
                asigproyectoData.getListaAyuda().add(proyecto);
            }
        }
    }

    public void accionNuevo() {
        asigproyectoData.setAsigProyecto(new AsignacionProyecto());
        asigproyectoData.getAsigProyecto().setEstado("Activo");
        asigproyectoData.getAsigProyecto().setFecha(new Date());
        asigproyectoData.setProyeto(new Proyecto());
        asigproyectoData.setCoordinador(new Coordinador());
        asigproyectoData.setListaProyectos(asigProyectoFacade.GetAllProyectos());
    }

    public void accionInicializar() {
        asigproyectoData.setAsigProyecto(new AsignacionProyecto());
        asigproyectoData.getAsigProyecto().setEstado("Activo");
        asigproyectoData.getAsigProyecto().setFecha(new Date());
        asigproyectoData.setProyeto(new Proyecto());
        asigproyectoData.setCoordinador(new Coordinador());
    }

}
