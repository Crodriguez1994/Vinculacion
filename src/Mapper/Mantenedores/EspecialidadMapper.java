/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Mantenedores;

import Modelo.Mantenedores.Especialidad;
import ModuloCap.Entidades.Especialidades;

/**
 *
 * @author Christian
 */
public class EspecialidadMapper implements IEspecialidadMapper{

    @Override
    public Especialidad EntityToModel(Especialidades especialidadEntity) {
        if(especialidadEntity == null){
            return null;
        }
        Especialidad especialdiad = new Especialidad();
        especialdiad.setEspecialidadid(especialidadEntity.getEspecialidadid());
        especialdiad.setEstado(especialidadEntity.getEstado().equals("A")?"ACTIVO":"INACTIVO");
        especialdiad.setNombre(especialidadEntity.getNombre().toUpperCase());
        especialdiad.setFecha(especialidadEntity.getFecha());
        return especialdiad;
    }

    @Override
    public Especialidades ModelToEntity(Especialidad especialidad) {
        if(especialidad == null) {
            return null;
        }
        
        Especialidades especialidades = new Especialidades();
        especialidades.setEspecialidadid(especialidad.getEspecialidadid());
        especialidades.setEstado(especialidad.getEstado().equals("ACTIVO")?"A":"I");
        especialidades.setNombre(especialidad.getNombre().toUpperCase());
        especialidades.setFecha(especialidad.getFecha());
        return especialidades;
    }
    
}
