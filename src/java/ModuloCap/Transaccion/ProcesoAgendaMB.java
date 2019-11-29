/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Transaccion;

import Modelo.Procesos.Agenda;
import Modelo.Procesos.AgendaPK;
import Modelo.Procesos.Capacitacion;
import Modelo.Procesos.DetaAgenda;
import Modelo.Procesos.Modulo;
import ModuloCap.Data.ProcesoAgendaDataMB;
import ModuloCap.Facade.FacadeProcesoAgendas;
import ModuloCap.Facade.IFacadeProcesoAgendas;
import java.io.Serializable;
import java.util.ArrayList;
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
public class ProcesoAgendaMB implements Serializable {

    @Inject
    private ProcesoAgendaDataMB agendaData;

    private IFacadeProcesoAgendas agendaFacade;

    @PostConstruct
    public void init() {
        accionInicializar();
        agendaFacade = new FacadeProcesoAgendas();
        agendaData.setListacapacitacion(agendaFacade.GetAllCapacitaciones());
    }

    public ProcesoAgendaMB() {
    }

    public ProcesoAgendaDataMB getAgendaData() {
        return agendaData;
    }

    public void setAgendaData(ProcesoAgendaDataMB agendaData) {
        this.agendaData = agendaData;
    }

    //<editor-fold defaultstate="collapsed" desc="1. ACCION AGENDA">
    public void accionGuardar() {
        FacesContext context = FacesContext.getCurrentInstance();
        agendaData.getAgenda().setModuloid(agendaData.getModulo());
        agendaData.getAgenda().setListaDetaAgenda(agendaData.getListadetaAgenda());
        agendaFacade.GuardarAgenda(agendaData.getAgenda());
        context.addMessage(null, new FacesMessage("Accion", "Registro Exitoso!"));
        accionNuevo();
    }

    public void accionSeleccionarC() {
        if (agendaData.getSeleccionarC() != null) {
            Capacitacion capacitacion = agendaData.getSeleccionarC();
            agendaData.setCapacitacion(capacitacion);
            if (capacitacion != null) {
                agendaData.setListaModulo(agendaFacade.GetModulosByCapapacitacion(capacitacion.getCabcapid()));
            }
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="2. ACCION DETALLE AGENDA">
    public void accionAgregarD() {
        int id= 1;
        agendaData.getListadetaAgenda().add(agendaData.getDetaAgenda());
        for(DetaAgenda d: agendaData.getListadetaAgenda()){
            agendaData.getDetaAgenda().setDetagendaid(id);
            id++;
        }
        agendaData.setDetaAgenda(new DetaAgenda());
        agendaData.getListadetaAgenda();
    }

    public void accionQuitarD(DetaAgenda deta) {
        agendaData.setSeleccionarD(deta);
        agendaData.getListadetaAgenda().remove(deta);
        agendaData.setDetaAgenda(new DetaAgenda());
        agendaData.getListadetaAgenda();
    }

    //</editor-fold>
    public void accionInicializar() {
        agendaData.setAgenda(new Agenda());
        agendaData.getAgenda().setEstado("Inactivo");
        agendaData.getAgenda().setModuloid(new Modulo());
        agendaData.setDetaAgenda(new DetaAgenda());
        agendaData.setAgendaPk(new AgendaPK());
        agendaData.setCapacitacion(new Capacitacion());
    }

    public void accionNuevo() {
        agendaData.setAgenda(new Agenda());
        agendaData.getAgenda().setEstado("Inactivo");
        agendaData.getAgenda().setModuloid(new Modulo());
        agendaData.setDetaAgenda(new DetaAgenda());
        agendaData.setAgendaPk(new AgendaPK());
        agendaData.setCapacitacion(new Capacitacion());
        agendaData.setListadetaAgenda(new ArrayList<>());
    }

}
