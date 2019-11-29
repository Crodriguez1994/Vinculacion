/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Data;

import Modelo.Mantenedores.Especialidad;
import Modelo.Mantenedores.Facilitador;
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
public class MantFacilitadoresDataMB implements Serializable {

    private Facilitador facilitador;
    private Facilitador seleccionarF;
    private List<Facilitador> listaFa = new ArrayList<>();

    private Especialidad especialidad;
    private Especialidad selecionarE;
    private List<Especialidad> listaEsp = new ArrayList<>();

    public MantFacilitadoresDataMB() {
    }

    public Facilitador getFacilitador() {
        return facilitador;
    }

    public void setFacilitador(Facilitador facilitador) {
        this.facilitador = facilitador;
    }

    public Facilitador getSeleccionarF() {
        return seleccionarF;
    }

    public void setSeleccionarF(Facilitador seleccionarF) {
        this.seleccionarF = seleccionarF;
    }

    public List<Facilitador> getListaFa() {
        return listaFa;
    }

    public void setListaFa(List<Facilitador> listaFa) {
        this.listaFa = listaFa;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Especialidad getSelecionarE() {
        return selecionarE;
    }

    public void setSelecionarE(Especialidad selecionarE) {
        this.selecionarE = selecionarE;
    }

    public List<Especialidad> getListaEsp() {
        return listaEsp;
    }

    public void setListaEsp(List<Especialidad> listaEsp) {
        this.listaEsp = listaEsp;
    }

}
