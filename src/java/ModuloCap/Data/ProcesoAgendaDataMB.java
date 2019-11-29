/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Data;

import Modelo.Procesos.Agenda;
import Modelo.Procesos.AgendaPK;
import Modelo.Procesos.Capacitacion;
import Modelo.Procesos.DetaAgenda;
import Modelo.Procesos.Modulo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Christian
 */
@Named
@ViewScoped
public class ProcesoAgendaDataMB implements Serializable {

    private Agenda agenda;
    private Agenda seleccionarA;
    private AgendaPK agendaPk;

    private DetaAgenda detaAgenda;
    private DetaAgenda seleccionarD;

    private Capacitacion capacitacion;
    private Capacitacion seleccionarC;

    private Modulo modulo;
    private Modulo seleccionM;

    private List<DetaAgenda> listadetaAgenda = new ArrayList<>();
    private List<Capacitacion> listacapacitacion = new ArrayList<>();
    private List<Modulo> listaModulo = new ArrayList<>();
    private List<Agenda> listaAgenda = new ArrayList<>();

    public ProcesoAgendaDataMB() {
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public Agenda getSeleccionarA() {
        return seleccionarA;
    }

    public void setSeleccionarA(Agenda seleccionarA) {
        this.seleccionarA = seleccionarA;
    }

    public AgendaPK getAgendaPk() {
        return agendaPk;
    }

    public void setAgendaPk(AgendaPK agendaPk) {
        this.agendaPk = agendaPk;
    }

    public Capacitacion getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(Capacitacion capacitacion) {
        this.capacitacion = capacitacion;
    }

    public Capacitacion getSeleccionarC() {
        return seleccionarC;
    }

    public void setSeleccionarC(Capacitacion seleccionarC) {
        this.seleccionarC = seleccionarC;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public Modulo getSeleccionM() {
        return seleccionM;
    }

    public void setSeleccionM(Modulo seleccionM) {
        this.seleccionM = seleccionM;
    }

    public List<DetaAgenda> getListadetaAgenda() {
        return listadetaAgenda;
    }

    public void setListadetaAgenda(List<DetaAgenda> listadetaAgenda) {
        this.listadetaAgenda = listadetaAgenda;
    }

    public List<Capacitacion> getListacapacitacion() {
        return listacapacitacion;
    }

    public void setListacapacitacion(List<Capacitacion> listacapacitacion) {
        this.listacapacitacion = listacapacitacion;
    }

    public List<Modulo> getListaModulo() {
        return listaModulo;
    }

    public void setListaModulo(List<Modulo> listaModulo) {
        this.listaModulo = listaModulo;
    }

    public DetaAgenda getDetaAgenda() {
        return detaAgenda;
    }

    public void setDetaAgenda(DetaAgenda detaAgenda) {
        this.detaAgenda = detaAgenda;
    }

    public DetaAgenda getSeleccionarD() {
        return seleccionarD;
    }

    public void setSeleccionarD(DetaAgenda seleccionarD) {
        this.seleccionarD = seleccionarD;
    }

    public List<Agenda> getListaAgenda() {
        return listaAgenda;
    }

    public void setListaAgenda(List<Agenda> listaAgenda) {
        this.listaAgenda = listaAgenda;
    }

}
