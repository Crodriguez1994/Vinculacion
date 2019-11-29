/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Data;

import Modelo.Mantenedores.Coordinador;
import Modelo.Mantenedores.Proyecto;
import Modelo.Procesos.AsignacionProyecto;
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
public class MantAsigProyectoDataMB implements Serializable {

    private AsignacionProyecto asigProyecto;
    private AsignacionProyecto seleccionAsig;
    private List<AsignacionProyecto> listaAsig;

    private Coordinador coordinador;
    private Coordinador seleccionCo;
    private List<Coordinador> listaCoordinador;

    private Proyecto proyeto;
    private Proyecto seleccionarP;
    private List<Proyecto> listaProyectos = new ArrayList<>();
    private List<Proyecto> ListaAyuda = new ArrayList<>();

    public MantAsigProyectoDataMB() {
    }

    public AsignacionProyecto getAsigProyecto() {
        return asigProyecto;
    }

    public void setAsigProyecto(AsignacionProyecto asigProyecto) {
        this.asigProyecto = asigProyecto;
    }

    public AsignacionProyecto getSeleccionAsig() {
        return seleccionAsig;
    }

    public void setSeleccionAsig(AsignacionProyecto seleccionAsig) {
        this.seleccionAsig = seleccionAsig;
    }

    public List<AsignacionProyecto> getListaAsig() {
        return listaAsig;
    }

    public void setListaAsig(List<AsignacionProyecto> listaAsig) {
        this.listaAsig = listaAsig;
    }

    public Coordinador getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    public Coordinador getSeleccionCo() {
        return seleccionCo;
    }

    public void setSeleccionCo(Coordinador seleccionCo) {
        this.seleccionCo = seleccionCo;
    }

    public List<Coordinador> getListaCoordinador() {
        return listaCoordinador;
    }

    public void setListaCoordinador(List<Coordinador> listaCoordinador) {
        this.listaCoordinador = listaCoordinador;
    }

    public Proyecto getProyeto() {
        return proyeto;
    }

    public void setProyeto(Proyecto proyeto) {
        this.proyeto = proyeto;
    }

    public Proyecto getSeleccionarP() {
        return seleccionarP;
    }

    public void setSeleccionarP(Proyecto seleccionarP) {
        this.seleccionarP = seleccionarP;
    }

    public List<Proyecto> getListaProyectos() {
        return listaProyectos;
    }

    public void setListaProyectos(List<Proyecto> listaProyectos) {
        this.listaProyectos = listaProyectos;
    }

    public List<Proyecto> getListaAyuda() {
        return ListaAyuda;
    }

    public void setListaAyuda(List<Proyecto> ListaAyuda) {
        this.ListaAyuda = ListaAyuda;
    }
    
    
}
