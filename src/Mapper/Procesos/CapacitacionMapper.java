/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Procesos;

import Modelo.Mantenedores.Coordinador;
import Modelo.Mantenedores.Proyecto;
import Modelo.Mantenedores.Sector;
import Modelo.Mantenedores.UnidadAtencion;
import Modelo.Procesos.AsignacionProyecto;
import Modelo.Procesos.Capacitacion;
import ModuloCap.Entidades.AsigProyectos;
import ModuloCap.Entidades.CabCapacitaciones;
import ModuloCap.Entidades.Coordinadores;
import ModuloCap.Entidades.Proyectos;
import ModuloCap.Entidades.Sectores;
import ModuloCap.Entidades.UnidadesAtencion;

/**
 *
 * @author Christian
 */
public class CapacitacionMapper implements ICapacitacionMapper {
    
    @Override
    public Capacitacion EntityToModel(CabCapacitaciones capacitacionEntity) {
        if (capacitacionEntity == null) {
            return null;
        }
        
        Proyecto proyecto = null;
        if (capacitacionEntity.getAsigproyectoid().getProyectoid() != null) {
            proyecto = new Proyecto();
            proyecto.setProyectoid(capacitacionEntity.getAsigproyectoid().getProyectoid().getProyectoid());
            proyecto.setNombre(capacitacionEntity.getAsigproyectoid().getProyectoid().getNombre().toUpperCase());
            
        }
        
        Coordinador coordinador = null;
        if (capacitacionEntity.getAsigproyectoid().getCoordinadorid() != null) {
            coordinador = new Coordinador();
            coordinador.setCoordinadorid(capacitacionEntity.getAsigproyectoid().getCoordinadorid().getCoordinadorid());
            coordinador.setCedula(capacitacionEntity.getAsigproyectoid().getCoordinadorid().getCedula().toUpperCase());
            coordinador.setApellidos(capacitacionEntity.getAsigproyectoid().getCoordinadorid().getApellidos().toUpperCase());
            coordinador.setNombres(capacitacionEntity.getAsigproyectoid().getCoordinadorid().getNombres().toUpperCase());
        }
        
        AsignacionProyecto asigProyecto = null;
        if (capacitacionEntity.getAsigproyectoid() != null) {
            asigProyecto = new AsignacionProyecto();
            asigProyecto.setAsigproyectoid(capacitacionEntity.getAsigproyectoid().getAsigproyectoid());
            asigProyecto.setCoordinadorid(coordinador);
            asigProyecto.setProyectoid(proyecto);
            
        }
        
        Sector sector = null;
        if (capacitacionEntity.getUnidadid().getSectorid() != null) {
            sector = new Sector();
            sector.setSectorid(capacitacionEntity.getUnidadid().getSectorid().getSectorid());
            sector.setNombre(capacitacionEntity.getUnidadid().getSectorid().getNombre().toUpperCase());
        }
        
        UnidadAtencion undAtncion = null;
        if (capacitacionEntity.getUnidadid() != null) {
            undAtncion = new UnidadAtencion();
            undAtncion.setUnidadid(capacitacionEntity.getUnidadid().getUnidadid());
            undAtncion.setProyectoid(proyecto);
            undAtncion.setSectorid(sector);
            undAtncion.setNombre(capacitacionEntity.getUnidadid().getNombre().toUpperCase());
        }
        
        Capacitacion capacitacion = new Capacitacion();
        capacitacion.setCabcapid(capacitacionEntity.getCabcapid());
        capacitacion.setAsigproyectoid(asigProyecto);
        capacitacion.setFecha(capacitacionEntity.getFecha());
        capacitacion.setNombre(capacitacionEntity.getNombre().toUpperCase());
        capacitacion.setFechaapertura(capacitacionEntity.getFechaapertura());
        capacitacion.setFechacierre(capacitacionEntity.getFechacierre());
        capacitacion.setUnidadid(undAtncion);
        capacitacion.setCupo(capacitacionEntity.getCupo());
        capacitacion.setLugar(capacitacionEntity.getLugar().toUpperCase());
        capacitacion.setEstado(capacitacionEntity.getEstado().equals("A") ? "ACTIVO" : "INACTIVO");
        capacitacion.setTipo(capacitacionEntity.getTipo().equals("I") ? "INTERNO" : "EXTERNO");
        
        return capacitacion;
    }
    
    @Override
    public CabCapacitaciones ModelToEntity(Capacitacion capacitacion) {
        
        if (capacitacion == null) {
            return null;
        }
        
        Proyectos proyecto = null;
        if (capacitacion.getAsigproyectoid().getProyectoid() != null) {
            proyecto = new Proyectos();
            proyecto.setProyectoid(capacitacion.getAsigproyectoid().getProyectoid().getProyectoid());
            proyecto.setNombre(capacitacion.getAsigproyectoid().getProyectoid().getNombre().toUpperCase());
        }
        
        Coordinadores coordinador = null;
        if (capacitacion.getAsigproyectoid().getCoordinadorid() != null) {
            coordinador = new Coordinadores();
            coordinador.setCoordinadorid(capacitacion.getAsigproyectoid().getCoordinadorid().getCoordinadorid());
            coordinador.setCedula(capacitacion.getAsigproyectoid().getCoordinadorid().getCedula().toUpperCase());
            coordinador.setApellidos(capacitacion.getAsigproyectoid().getCoordinadorid().getApellidos().toUpperCase());
            coordinador.setNombres(capacitacion.getAsigproyectoid().getCoordinadorid().getNombres().toUpperCase());
        }
        
        AsigProyectos asigproyecto = null;
        if (capacitacion.getAsigproyectoid() != null) {
            asigproyecto = new AsigProyectos();
            asigproyecto.setAsigproyectoid(capacitacion.getAsigproyectoid().getAsigproyectoid());
            asigproyecto.setProyectoid(proyecto == null ? null : proyecto);
            asigproyecto.setCoordinadorid(coordinador == null ? null : coordinador);
        }
        
        Sectores sector = null;
        if (capacitacion.getUnidadid().getSectorid() != null) {
            sector = new Sectores();
            sector.setSectorid(capacitacion.getUnidadid().getSectorid().getSectorid());
            sector.setNombre(capacitacion.getUnidadid().getSectorid().getNombre().toUpperCase());
        }
        
        UnidadesAtencion undAtencion = null;
        if (capacitacion.getUnidadid() != null) {
            undAtencion = new UnidadesAtencion();
            undAtencion.setUnidadid(capacitacion.getUnidadid().getUnidadid());
            undAtencion.setProyectoid(proyecto == null ? null : proyecto);
            undAtencion.setSectorid(sector == null ? null : sector);
            undAtencion.setNombre(capacitacion.getUnidadid().getNombre().toUpperCase());
        }
        
        CabCapacitaciones cabCapacitacion = new CabCapacitaciones();
        
        cabCapacitacion.setAsigproyectoid(asigproyecto == null ? null : asigproyecto);
        cabCapacitacion.setFecha(capacitacion.getFecha());
        cabCapacitacion.setNombre(capacitacion.getNombre().toUpperCase());
        cabCapacitacion.setFechaapertura(capacitacion.getFechaapertura());
        cabCapacitacion.setFechacierre(capacitacion.getFechacierre());
        cabCapacitacion.setUnidadid(undAtencion == null ? null : undAtencion);
        cabCapacitacion.setCupo(capacitacion.getCupo());
        cabCapacitacion.setLugar(capacitacion.getLugar().toUpperCase());
        cabCapacitacion.setEstado(capacitacion.getEstado().equals("ACTIVO") ? "A" : "I");
        cabCapacitacion.setTipo(capacitacion.getTipo().equals("INTERNO") ? "I" : "E");
        
        return cabCapacitacion;
    }
    
}
