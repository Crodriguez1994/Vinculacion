/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Transaccion;

import Modelo.Mantenedores.Beneficiario;
import ModuloCap.Data.MantBeneficiariosDataMB;
import ModuloCap.Facade.FacadeMantBeneficiario;
import java.io.Serializable;
import java.util.Date;
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
public class MantBeneficiariosMB implements Serializable {

    @Inject
    private MantBeneficiariosDataMB beneficiarioData;
    private FacadeMantBeneficiario beneficiarioFacade;

    @PostConstruct
    public void Init() {
        beneficiarioData.setBeneficiario(new Beneficiario());
        beneficiarioData.getBeneficiario().setEstado("ACTIVO");
        beneficiarioData.getBeneficiario().setFecha(new Date());
        beneficiarioFacade = new FacadeMantBeneficiario();
        beneficiarioData.setListaBe(beneficiarioFacade.GettAllBeneficiarios());
        System.out.println("aviso!"+beneficiarioFacade.GettAllBeneficiarios().toString());
    }

    public MantBeneficiariosMB() {
    }

    public MantBeneficiariosDataMB getBeneficiarioData() {
        return beneficiarioData;
    }

    public void setBeneficiarioData(MantBeneficiariosDataMB beneficiarioData) {
        this.beneficiarioData = beneficiarioData;
    }

    public void accionSeleccionar() {
        if (beneficiarioData.getSeleccionarB() != null) {
            Beneficiario benefciario = beneficiarioData.getSeleccionarB();
            beneficiarioData.setBeneficiario(benefciario);
        }
    }

    public void accionGuardar() {
        System.out.println("AVISO !" + beneficiarioData.getBeneficiario().toString());
        FacesContext context = FacesContext.getCurrentInstance();
        beneficiarioFacade.GuardarBeneficiario(beneficiarioData.getBeneficiario());
        beneficiarioData.setListaBe(beneficiarioFacade.GettAllBeneficiarios());
        context.addMessage(null, new FacesMessage("Accion", "Registro Exitoso!"));
        accionNuevo();
    }

    public void accionNuevo() {
        System.out.println("aviso!"+beneficiarioFacade.GettAllBeneficiarios().toString());
        beneficiarioData.setBeneficiario(new Beneficiario());
        beneficiarioData.getBeneficiario().setEstado("ACTIVO");
        beneficiarioData.getBeneficiario().setFecha(new Date());
    }
}
