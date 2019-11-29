/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Data;

import Modelo.Mantenedores.Beneficiario;
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
public class MantBeneficiariosDataMB implements Serializable {

    private Beneficiario beneficiario;
    private Beneficiario seleccionarB;
    private List<Beneficiario> ListaBe = new ArrayList<>();

    public MantBeneficiariosDataMB() {
    }

    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Beneficiario beneficiario) {
        this.beneficiario = beneficiario;
    }

    public Beneficiario getSeleccionarB() {
        return seleccionarB;
    }

    public void setSeleccionarB(Beneficiario seleccionarB) {
        this.seleccionarB = seleccionarB;
    }

    public List<Beneficiario> getListaBe() {
        return ListaBe;
    }

    public void setListaBe(List<Beneficiario> ListaBe) {
        this.ListaBe = ListaBe;
    }


}
