/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Data;

import Modelo.Mantenedores.Coordinador;
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
public class MantCoordinadorDataMB implements Serializable {

    private Coordinador coordinador;
    private Coordinador selecionarC;
    private List<Coordinador> listaCo = new ArrayList<>();

    public MantCoordinadorDataMB() {
    }

    public Coordinador getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    public Coordinador getSelecionarC() {
        return selecionarC;
    }

    public void setSelecionarC(Coordinador selecionarC) {
        this.selecionarC = selecionarC;
    }

    public List<Coordinador> getListaCo() {
        return listaCo;
    }

    public void setListaCo(List<Coordinador> listaCo) {
        this.listaCo = listaCo;
    }

}
