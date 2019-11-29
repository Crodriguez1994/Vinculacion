/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Transaccion;

import Modelo.Mantenedores.Especialidad;
import Modelo.Mantenedores.Facilitador;
import ModuloCap.Data.MantFacilitadoresDataMB;
import ModuloCap.Facade.FacadeMantFacilitadores;
import java.io.Serializable;
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
public class MantFacilitadoresMB implements Serializable {

    @Inject
    private MantFacilitadoresDataMB facilitadorData;
    private FacadeMantFacilitadores facilitadreFacade;

    @PostConstruct
    public void Init() {
        facilitadorData.setFacilitador(new Facilitador());
        facilitadorData.getFacilitador().setEspecialidad(new Especialidad());
        facilitadreFacade = new FacadeMantFacilitadores();
        facilitadorData.setListaFa(facilitadreFacade.GetAllFacilitadores());
        facilitadorData.setListaEsp(facilitadreFacade.GetAllEspecialidades());
    }

    public MantFacilitadoresMB() {
    }

    public MantFacilitadoresDataMB getFacilitadorData() {
        return facilitadorData;
    }

    public void setFacilitadorData(MantFacilitadoresDataMB facilitadorData) {
        this.facilitadorData = facilitadorData;
    }

    public void accionSeleccionar() {
        if (facilitadorData.getSeleccionarF() != null) {
            facilitadorData.setFacilitador(facilitadorData.getSeleccionarF());
        }
    }

    public void onSeleccionEsp() {
        Especialidad esp = facilitadorData.getFacilitador().getEspecialidad();
        if (esp != null) {
            facilitadorData.getFacilitador().setEspecialidad(esp);
        }
    }

    public void accionGuardar() {
        FacesContext context = FacesContext.getCurrentInstance();
        if (ValidarCedula(facilitadorData.getFacilitador().getCedula()) == true || VerificarRC(facilitadorData.getFacilitador().getCedula()) == true) {
            System.out.println("ALERTA!!");
            if (facilitadorData.getFacilitador().getCedula() != null) {
                facilitadreFacade.Guardar(facilitadorData.getFacilitador());
                facilitadorData.setListaFa(facilitadreFacade.GetAllFacilitadores());
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Accion", "Registro Exitoso!"));
                accionNuevo();
            } else {
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Falta Cedula!"));
            }
        } else {
            accionNuevo();
            facilitadorData.setListaFa(facilitadreFacade.GetAllFacilitadores());
        }
    }

    public void accionNuevo() {
        facilitadorData.setFacilitador(new Facilitador());
        facilitadorData.getFacilitador().setEspecialidad(new Especialidad());
    }

    public boolean ValidarCedula(String cedula) {
        FacesContext context = FacesContext.getCurrentInstance();
        boolean verificar = false;
        char[] LenghtCedula = cedula.toCharArray();
        String DigitRegion = cedula.substring(0, 2);
        int sumatotal = 0;
        if ((Integer.parseInt(DigitRegion) >= 1) && (Integer.parseInt(DigitRegion) <= 24)) {

            for (int i = 0; i < cedula.length() - 1; i++) {
                int numero = Integer.parseInt(Character.toString(LenghtCedula[i]));
                if ((i + 1) % 2 == 1) {
                    numero = Integer.parseInt(Character.toString(LenghtCedula[i])) * 2;
                    if (numero > 9) {
                        numero = numero - 9;
                    }
                }
                sumatotal += numero;
            }
            sumatotal = 10 - (sumatotal % 10);

            if (sumatotal != Integer.parseInt(cedula.substring(9))) {
                verificar = false;
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Cedula No Valida!"));
            } else {
                verificar = true;
            }
        } else {
            verificar = false;
        }
        return verificar;

    }

    public boolean VerificarRC(String numero) {
        FacesContext context = FacesContext.getCurrentInstance();
        boolean verificar = false;
        if (numero.length() == 13) {
            String ruc = (numero.substring(10));
            if (!ruc.equals("001")) {
                verificar = false;
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Ruc No Valido!"));
            } else {
                verificar = true;
            }
        } else {
            verificar = false;
        }
        return verificar;
    }

}
