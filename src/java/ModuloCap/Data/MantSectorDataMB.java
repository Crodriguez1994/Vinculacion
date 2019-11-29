/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Data;

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
public class MantSectorDataMB implements Serializable {

    private Sector sector;
    private Sector seleccionarS;
    private List<Sector> ListaSec;

    public MantSectorDataMB() {
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public Sector getSeleccionarS() {
        return seleccionarS;
    }

    public void setSeleccionarS(Sector seleccionarS) {
        this.seleccionarS = seleccionarS;
    }

    public List<Sector> getListaSec() {
        return ListaSec;
    }

    public void setListaSec(List<Sector> ListaSec) {
        this.ListaSec = ListaSec;
    }

}
