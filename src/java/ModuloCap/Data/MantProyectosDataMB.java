/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Data;

import Modelo.Mantenedores.Proyecto;
import Modelo.Mantenedores.ProyectoPK;
import Modelo.Mantenedores.ProyectoSector;
import Modelo.Mantenedores.Sector;
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
public class MantProyectosDataMB implements Serializable {

    private Proyecto proyeto;
    private Proyecto seleccionarP;
    private List<Proyecto> listaProyectos = new ArrayList<>();

    private ProyectoPK proyectoPk;
    private ProyectoSector asigSector;
    private ProyectoSector seleccionarAsig;
    private List<ProyectoSector> listaAsig = new ArrayList<>();

    private Sector sector;
    private Sector SeleccionarS;
    private List<Sector> listaSe = new ArrayList<>();
    private List<Sector> ListaAux = new ArrayList<>();

    public MantProyectosDataMB() {
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

    public ProyectoSector getAsigSector() {
        return asigSector;
    }

    public void setAsigSector(ProyectoSector asigSector) {
        this.asigSector = asigSector;
    }

    public ProyectoSector getSeleccionarAsig() {
        return seleccionarAsig;
    }

    public void setSeleccionarAsig(ProyectoSector seleccionarAsig) {
        this.seleccionarAsig = seleccionarAsig;
    }

    public List<ProyectoSector> getListaAsig() {
        return listaAsig;
    }

    public void setListaAsig(List<ProyectoSector> listaAsig) {
        this.listaAsig = listaAsig;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public Sector getSeleccionarS() {
        return SeleccionarS;
    }

    public void setSeleccionarS(Sector SeleccionarS) {
        this.SeleccionarS = SeleccionarS;
    }

    public List<Sector> getListaSe() {
        return listaSe;
    }

    public void setListaSe(List<Sector> listaSe) {
        this.listaSe = listaSe;
    }

    public ProyectoPK getProyectoPk() {
        return proyectoPk;
    }

    public void setProyectoPk(ProyectoPK proyectoPk) {
        this.proyectoPk = proyectoPk;
    }

    public List<Sector> getListaAux() {
        return ListaAux;
    }

    public void setListaAux(List<Sector> ListaAux) {
        this.ListaAux = ListaAux;
    }

}
