/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Data;

import Modelo.Mantenedores.Especialidad;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author Christian
 */
@Named
@ViewScoped
public class MantEspecialidadDataMB implements Serializable {

    private Especialidad especialidad;
    private Especialidad seleccionarE;
    private List<Especialidad> listaE = new ArrayList<>();

    public MantEspecialidadDataMB() {
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Especialidad getSeleccionarE() {
        return seleccionarE;
    }

    public void setSeleccionarE(Especialidad seleccionarE) {
        this.seleccionarE = seleccionarE;
    }

    public List<Especialidad> getListaE() {
        return listaE;
    }

    public void setListaE(List<Especialidad> listaE) {
        this.listaE = listaE;
    }

}
