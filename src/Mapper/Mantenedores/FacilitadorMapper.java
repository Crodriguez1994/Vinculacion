/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Mantenedores;

import Modelo.Mantenedores.Especialidad;
import Modelo.Mantenedores.Facilitador;
import ModuloCap.Entidades.Especialidades;
import ModuloCap.Entidades.Facilitadores;

/**
 *
 * @author Christian
 */
public class FacilitadorMapper implements IFacilitadorMapper {

    @Override
    public Facilitador EntiyToModel(Facilitadores facilitadorEntity) {
        
        if (facilitadorEntity == null) {
            return null;
        }

        Especialidad especialidad = null;
        if (facilitadorEntity.getEspecialidadid() != null) {
            especialidad = new Especialidad();
            especialidad.setEspecialidadid(facilitadorEntity.getEspecialidadid().getEspecialidadid());
            especialidad.setNombre(facilitadorEntity.getEspecialidadid().getNombre().toUpperCase());
        }
        Facilitador facilitador = new Facilitador();
        facilitador.setFacilitadorid(facilitadorEntity.getFacilitadorid());
        facilitador.setEspecialidad(especialidad);
        facilitador.setCedula(facilitadorEntity.getCedula().toUpperCase());
        facilitador.setApellidos(facilitadorEntity.getApellidos().toUpperCase());
        facilitador.setNombres(facilitadorEntity.getNombres().toUpperCase());
        facilitador.setDireccion(facilitadorEntity.getDireccion().toUpperCase());
        facilitador.setCelular(facilitadorEntity.getCelular().toUpperCase());
        facilitador.setConvencional(facilitadorEntity.getConvencional().toUpperCase());
        facilitador.setEmail(facilitadorEntity.getEmail().toUpperCase());
        facilitador.setFechaingreso(facilitadorEntity.getFechaingreso());
        facilitador.setEstado(facilitadorEntity.getEstado().equals("A") ? "ACTIVO" : "INACTIVO");
        facilitador.setTipo(facilitadorEntity.getTipo().equals("I") ? "INTERNO" : "EXTERNO");
        facilitador.setSeleccionar(false);

        return facilitador;

    }

    @Override
    public Facilitadores ModelToEntity(Facilitador facilitador) {
        if (facilitador == null) {
            return null;
        }
       Especialidades especialidad = null;
        if (facilitador.getEspecialidad() != null) {
            especialidad = new Especialidades();
            especialidad.setEspecialidadid(facilitador.getEspecialidad().getEspecialidadid());
            especialidad.setNombre(facilitador.getEspecialidad().getNombre().toUpperCase());
        }
        Facilitadores facilitadores = new Facilitadores();
        facilitadores.setFacilitadorid(facilitador.getFacilitadorid());
        facilitadores.setEspecialidadid(especialidad);
        facilitadores.setCedula(facilitador.getCedula().toUpperCase());
        facilitadores.setApellidos(facilitador.getApellidos().toUpperCase());
        facilitadores.setNombres(facilitador.getNombres().toUpperCase());
        facilitadores.setDireccion(facilitador.getDireccion().toUpperCase());
        facilitadores.setCelular(facilitador.getCelular().toUpperCase());
        facilitadores.setConvencional(facilitador.getConvencional().toUpperCase());
        facilitadores.setEmail(facilitador.getEmail().toUpperCase());
        facilitadores.setFechaingreso(facilitador.getFechaingreso());
        facilitadores.setEstado(facilitador.getEstado().equals("ACTIVO") ? "A" : "I");
        facilitadores.setTipo(facilitador.getTipo().equals("INTERNO") ? "I" : "E");
        return facilitadores;
    }

}
