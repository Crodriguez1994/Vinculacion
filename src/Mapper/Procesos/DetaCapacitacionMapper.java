/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Procesos;

import Modelo.Mantenedores.Facilitador;
import Modelo.Procesos.Capacitacion;
import Modelo.Procesos.CapacitacionPK;
import Modelo.Procesos.DetaCapacitacion;
import ModuloCap.Entidades.DetaCapacitaciones;
import ModuloCap.Entidades.DetaCapacitacionesPK;
import ModuloCap.Entidades.Facilitadores;

/**
 *
 * @author Christian
 */
public class DetaCapacitacionMapper implements IDetaCapacitacionMapper {
    
    @Override
    public DetaCapacitacion EntityToModel(DetaCapacitaciones detacapacitacionEntity) {
        if (detacapacitacionEntity == null) {
            return null;
        }
        Facilitador facilitador = null;
        if (detacapacitacionEntity.getFacilitadorid() != null) {
            facilitador = new Facilitador();
            facilitador.setFacilitadorid(detacapacitacionEntity.getFacilitadorid().getFacilitadorid());
            facilitador.setCedula(detacapacitacionEntity.getFacilitadorid().getCedula().toUpperCase());
            facilitador.setApellidos(detacapacitacionEntity.getFacilitadorid().getApellidos().toUpperCase());
            facilitador.setNombres(detacapacitacionEntity.getFacilitadorid().getNombres().toUpperCase());
            facilitador.setSeleccionar(false);
        }
        
        Capacitacion capacitacion = null;
        if (detacapacitacionEntity.getCabCapid() != null) {
            capacitacion = new Capacitacion();
            capacitacion.setCabcapid(detacapacitacionEntity.getCabCapid().getCabcapid());
            capacitacion.setNombre(detacapacitacionEntity.getCabCapid().getNombre().toUpperCase());
        }
        
        CapacitacionPK compuestapk = null;
        if (detacapacitacionEntity.getDetacapacitacionesPk() != null) {
            compuestapk = new CapacitacionPK();
            compuestapk.setCabcapid(detacapacitacionEntity.getDetacapacitacionesPk().getCabcapid());
            compuestapk.setDetacapid(detacapacitacionEntity.getDetacapacitacionesPk().getDetacapid());
        }
        
        DetaCapacitacion detaCapacitacion = new DetaCapacitacion();
        detaCapacitacion.setDetaCapacitacionid(detacapacitacionEntity.getDetacapacitacionesPk().getDetacapid());
        detaCapacitacion.setCompuestaPk(compuestapk);
        detaCapacitacion.setFacilitadorid(facilitador);
        return detaCapacitacion;
    }
    
    @Override
    public DetaCapacitaciones ModelToEntity(DetaCapacitacion detacapacitacion) {
        if (detacapacitacion == null) {
            return null;
        }
        Facilitadores facilitador = null;
        if (detacapacitacion.getFacilitadorid() != null) {
            facilitador = new Facilitadores();
            facilitador.setFacilitadorid(detacapacitacion.getFacilitadorid().getFacilitadorid());
            facilitador.setCedula(detacapacitacion.getFacilitadorid().getCedula().toUpperCase());
            facilitador.setApellidos(detacapacitacion.getFacilitadorid().getApellidos().toUpperCase());
            facilitador.setNombres(detacapacitacion.getFacilitadorid().getNombres().toUpperCase());
        }
       
        
        DetaCapacitacionesPK compuestaPk = null;
        if (detacapacitacion.getCompuestaPk() != null) {
            compuestaPk = new DetaCapacitacionesPK();
            compuestaPk.setDetacapid(detacapacitacion.getDetaCapacitacionid());
        }
        
        DetaCapacitaciones detaCapacitaciones = new DetaCapacitaciones();
        detaCapacitaciones.setDetacapacitacionesPk(compuestaPk);
        detaCapacitaciones.setFacilitadorid(facilitador);
        
        return detaCapacitaciones;
        
    }
    
}
