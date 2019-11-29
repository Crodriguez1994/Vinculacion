/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Transaccion;

import Modelo.Mantenedores.Sector;
import ModuloCap.Data.MantSectorDataMB;
import ModuloCap.Facade.FacadeMantSectores;
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
public class MantSectorMB implements Serializable {

    @Inject
    private MantSectorDataMB sectorData;
    private FacadeMantSectores sectorFacade;

    @PostConstruct
    public void Init() {
        accionNuevo();
        sectorFacade = new FacadeMantSectores();
        sectorData.setListaSec(sectorFacade.GetAllSectores());

    }

    public MantSectorMB() {
    }

    public MantSectorDataMB getSectorData() {
        return sectorData;
    }

    public void setSectorData(MantSectorDataMB sectorData) {
        this.sectorData = sectorData;
    }

    public void accionGuardar() {
        FacesContext context = FacesContext.getCurrentInstance();
        sectorFacade.GuardarSector(sectorData.getSector());
        sectorData.setListaSec(sectorFacade.GetAllSectores());
        context.addMessage(null, new FacesMessage("Accion", "Registro Exitoso!"));
        accionNuevo();
    }

    public void accionSeleccionar() {
        if (sectorData.getSeleccionarS() != null) {
            Sector sector = sectorData.getSeleccionarS();
            sectorData.setSector(sector);
        }
    }

    public void accionNuevo() {
        sectorData.setSector(new Sector());
        sectorData.getSector().setEstado("Activo");
        sectorData.getSector().setFecha(new Date());
    }

}
