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
public interface IEspecialidadMapper {

    public Especialidad EntityToModel(Especialidades especialidadEntity);

    public Especialidades ModelToEntity(Especialidad especialidad);
}
