/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Transaccion;

import Modelo.Mantenedores.Coordinador;
import ModuloCap.Data.MantCoordinadorDataMB;
import ModuloCap.Facade.FacadeMantCoordinador;
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
public class MantCoordinadorMB implements Serializable {

    @Inject
    private MantCoordinadorDataMB coordinadorData;
    private FacadeMantCoordinador coordinadorFacade;

    @PostConstruct
    public void Init() {
        accionNuevo();
        coordinadorFacade = new FacadeMantCoordinador();
        coordinadorData.setListaCo(coordinadorFacade.GetAllCoordinador());
    }

    public MantCoordinadorMB() {
    }

    public MantCoordinadorDataMB getCoordinadorData() {
        return coordinadorData;
    }

    public void setCoordinadorData(MantCoordinadorDataMB coordinadorData) {
        this.coordinadorData = coordinadorData;
    }

    public void accionSeleccionar() {
        if (coordinadorData.getSelecionarC() != null) {
            Coordinador coordinador = coordinadorData.getSelecionarC();
            coordinadorData.setCoordinador(coordinador);
        }
    }

    public void accionGuardar() {
        FacesContext context = FacesContext.getCurrentInstance();
        coordinadorFacade.GuardarCoordinador(coordinadorData.getCoordinador());
        coordinadorData.setListaCo(coordinadorFacade.GetAllCoordinador());
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Accion", "Registro Exitoso!"));
        accionNuevo();
    }

    public void accionNuevo() {
        coordinadorData.setCoordinador(new Coordinador());
        coordinadorData.getCoordinador().setEstado("Activo");
        coordinadorData.getCoordinador().setFechaingreso(new Date());
    }

}
