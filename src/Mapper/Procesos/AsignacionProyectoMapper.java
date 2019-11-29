/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Procesos;

import Modelo.Mantenedores.Coordinador;
import Modelo.Mantenedores.Proyecto;
import Modelo.Procesos.AsignacionProyecto;
import ModuloCap.Entidades.AsigProyectos;
import ModuloCap.Entidades.Coordinadores;
import ModuloCap.Entidades.Proyectos;

/**
 *
 * @author Christian
 */
public class AsignacionProyectoMapper implements IAsignacionProyectoMapper {

    @Override
    public AsignacionProyecto EntityToModel(AsigProyectos asigProyectoEntity) {
        if (asigProyectoEntity == null) {
            return null;
        }

        Proyecto proyecto = null;
        if (asigProyectoEntity.getProyectoid() != null) {
            proyecto = new Proyecto();
            proyecto.setProyectoid(asigProyectoEntity.getProyectoid().getProyectoid());
            proyecto.setNombre(asigProyectoEntity.getProyectoid().getNombre().toUpperCase());
        }

        Coordinador coordinador = null;
        if (asigProyectoEntity.getCoordinadorid() != null) {
            coordinador = new Coordinador();
            coordinador.setCoordinadorid(asigProyectoEntity.getCoordinadorid().getCoordinadorid());
            coordinador.setCedula(asigProyectoEntity.getCoordinadorid().getCedula().toUpperCase());
            coordinador.setApellidos(asigProyectoEntity.getCoordinadorid().getApellidos().toUpperCase());
            coordinador.setNombres(asigProyectoEntity.getCoordinadorid().getNombres().toUpperCase());
        }

        AsignacionProyecto asigProyecto = new AsignacionProyecto();
        asigProyecto.setAsigproyectoid(asigProyectoEntity.getAsigproyectoid());
        asigProyecto.setCoordinadorid(coordinador);
        asigProyecto.setProyectoid(proyecto);
        asigProyecto.setFecha(asigProyectoEntity.getFecha());
        asigProyecto.setEstado(asigProyectoEntity.getEstado().equals("A") ? "ACTIVO" : "INACTIVO");

        return asigProyecto;
    }

    @Override
    public AsigProyectos ModelToEntity(AsignacionProyecto asigProyecto) {
        if (asigProyecto == null) {
            return null;
        }
        Proyectos proyecto = null;
        if (asigProyecto.getProyectoid() != null) {
            proyecto = new Proyectos();
            proyecto.setProyectoid(asigProyecto.getProyectoid().getProyectoid());
            proyecto.setNombre(asigProyecto.getProyectoid().getNombre().toUpperCase());
        }

        Coordinadores coordinador = null;
        if (asigProyecto.getCoordinadorid() != null) {
            coordinador = new Coordinadores();
            coordinador.setCoordinadorid(asigProyecto.getCoordinadorid().getCoordinadorid());
            coordinador.setCedula(asigProyecto.getCoordinadorid().getCedula().toUpperCase());
            coordinador.setApellidos(asigProyecto.getCoordinadorid().getApellidos().toUpperCase());
            coordinador.setNombres(asigProyecto.getCoordinadorid().getNombres().toUpperCase());
        }

        AsigProyectos asigProyectos = new AsigProyectos();
        asigProyectos.setAsigproyectoid(asigProyecto.getAsigproyectoid());
        asigProyectos.setCoordinadorid(coordinador);
        asigProyectos.setProyectoid(proyecto);
        asigProyectos.setFecha(asigProyecto.getFecha());
        asigProyectos.setEstado(asigProyecto.getEstado().equals("ACTIVO") ? "A" : "I");

        return asigProyectos;

    }

}
