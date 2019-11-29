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
public class ProcesoAprobacionAgendaMB implements Serializable {

    @Inject
    private ProcesoAgendaDataMB agendaData;

    private IFacadeProcesoAgendas agendaFacade;

    @PostConstruct
    public void init() {
        accionInicializar();
        agendaFacade = new FacadeProcesoAgendas();
        agendaData.setListaAgenda(agendaFacade.GetAllAgendas());
    }

    public ProcesoAprobacionAgendaMB() {
    }

    public ProcesoAgendaDataMB getAgendaData() {
        return agendaData;
    }

    public void setAgendaData(ProcesoAgendaDataMB agendaData) {
        this.agendaData = agendaData;
    }

    //<editor-fold defaultstate="collapsed" desc="1. ACCION AGENDA">
    public void accionAprobar() {
        FacesContext context = FacesContext.getCurrentInstance();
        if ("Inactivo".equals(agendaData.getAgenda().getEstado())) {
            agendaData.getAgenda().setEstado("Aprobado");
            agendaData.getAgenda().getListaDetaAgenda();
            agendaFacade.GuardarAgenda(agendaData.getAgenda());
            context.addMessage(null, new FacesMessage("Accion", "Agenda Aprobada!"));
            accionNuevo();
        } else {
            context.addMessage(null, new FacesMessage("Alerta", "La Agenda ya esta Aprobada!"));
            accionNuevo();
        }

    }

    public void accionSeleccionarC() {
        if (agendaData.getSeleccionarA() != null) {
            Agenda agenda = agendaData.getSeleccionarA();
            agendaData.setAgenda(agenda);
        }
        Agenda age = agendaData.getAgenda();
        agendaData.setListadetaAgenda(agendaFacade.GetDetaAgendaByCabecera(age.getCabagendaid()));
    }
    //</editor-fold>

    public void accionNuevo(){
        agendaData.setAgenda(new Agenda());
        agendaData.setListadetaAgenda(new ArrayList<>());
    }
    
    public void accionInicializar() {
        agendaData.setAgenda(new Agenda());
        agendaData.getAgenda().setModuloid(new Modulo());
        agendaData.setDetaAgenda(new DetaAgenda());
        agendaData.setAgendaPk(new AgendaPK());
        agendaData.setCapacitacion(new Capacitacion());
    }
}
