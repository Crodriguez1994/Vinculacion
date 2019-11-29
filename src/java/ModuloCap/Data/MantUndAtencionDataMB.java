/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Data;

import Modelo.Mantenedores.Proyecto;
import Modelo.Mantenedores.ProyectoSector;
import Modelo.Mantenedores.Sector;
import Modelo.Mantenedores.UnidadAtencion;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Christian
 */
@Named
@ViewScoped
public class MantUndAtencionDataMB implements Serializable {

    private UnidadAtencion undAtencion;
    private UnidadAtencion seleccionarUnd;
    private List<UnidadAtencion> listaUnd = new ArrayList<>();

    private Proyecto proyecto;
    private Proyecto SeleccionarP;
    private List<Proyecto> listaPro = new ArrayList<>();

    private Sector Sector;
    private Sector seleccionarS;
    private List<Sector> listaSec = new ArrayList<>();

    private ProyectoSector proyectosector;
    private ProyectoSector selecionarPS;
    private List<ProyectoSector> listaPoyectoSector = new ArrayList<>();

    public MantUndAtencionDataMB() {
    }

    public UnidadAtencion getUndAtencion() {
        return undAtencion;
    }

    public void setUndAtencion(UnidadAtencion undAtencion) {
        this.undAtencion = undAtencion;
    }

    public UnidadAtencion getSeleccionarUnd() {
        return seleccionarUnd;
    }

    public void setSeleccionarUnd(UnidadAtencion seleccionarUnd) {
        this.seleccionarUnd = seleccionarUnd;
    }

    public List<UnidadAtencion> getListaUnd() {
        return listaUnd;
    }

    public void setListaUnd(List<UnidadAtencion> listaUnd) {
        this.listaUnd = listaUnd;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Proyecto getSeleccionarP() {
        return SeleccionarP;
    }

    public void setSeleccionarP(Proyecto SeleccionarP) {
        this.SeleccionarP = SeleccionarP;
    }

    public Sector getSector() {
        return Sector;
    }

    public void setSector(Sector Sector) {
        this.Sector = Sector;
    }

    public Sector getSeleccionarS() {
        return seleccionarS;
    }

    public void setSeleccionarS(Sector seleccionarS) {
        this.seleccionarS = seleccionarS;
    }

    public ProyectoSector getProyectosector() {
        return proyectosector;
    }

    public void setProyectosector(ProyectoSector proyectosector) {
        this.proyectosector = proyectosector;
    }

    public ProyectoSector getSelecionarPS() {
        return selecionarPS;
    }

    public void setSelecionarPS(ProyectoSector selecionarPS) {
        this.selecionarPS = selecionarPS;
    }

    public List<ProyectoSector> getListaPoyectoSector() {
        return listaPoyectoSector;
    }

    public void setListaPoyectoSector(List<ProyectoSector> listaPoyectoSector) {
        this.listaPoyectoSector = listaPoyectoSector;
    }

    public List<Proyecto> getListaPro() {
        return listaPro;
    }

    public void setListaPro(List<Proyecto> listaPro) {
        this.listaPro = listaPro;
    }

    public List<Sector> getListaSec() {
        return listaSec;
    }

    public void setListaSec(List<Sector> listaSec) {
        this.listaSec = listaSec;
    }

}
