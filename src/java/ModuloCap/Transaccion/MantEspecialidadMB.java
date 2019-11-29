/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Transaccion;

import Modelo.Mantenedores.Especialidad;
import ModuloCap.Data.MantEspecialidadDataMB;
import ModuloCap.Facade.FacadeMantEspecialidades;
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
public class MantEspecialidadMB implements Serializable {

    @Inject
    private MantEspecialidadDataMB especialidadData;
    private FacadeMantEspecialidades especialidadFacade;

    @PostConstruct
    public void Init() {
        especialidadData.setEspecialidad(new Especialidad());
        especialidadData.getEspecialidad().setEstado("Activo");
        especialidadData.getEspecialidad().setFecha(new Date());
        especialidadFacade = new FacadeMantEspecialidades();
        especialidadData.setListaE(especialidadFacade.GetAllEspecialidades());

    }

    public MantEspecialidadDataMB getEspecialidadData() {
        return especialidadData;
    }

    public void setEspecialidadData(MantEspecialidadDataMB especialidadData) {
        this.especialidadData = especialidadData;
    }

    public void accionSeleccionar() {
        if (especialidadData.getSeleccionarE() != null) {
            especialidadData.setEspecialidad(especialidadData.getSeleccionarE());
        }
    }

    public void accionGuardar() {
        FacesContext context = FacesContext.getCurrentInstance();
        especialidadFacade.GuardarEspecialidad(especialidadData.getEspecialidad());
        especialidadData.setListaE(especialidadFacade.GetAllEspecialidades());
        context.addMessage(null, new FacesMessage("Accion", "Registro Exitoso!"));
        accionNuevo();
    }

    public void accionNuevo() {
        especialidadData.setEspecialidad(new Especialidad());
        especialidadData.getEspecialidad().setEstado("Activo");
        especialidadData.getEspecialidad().setFecha(new Date());

    }
}
