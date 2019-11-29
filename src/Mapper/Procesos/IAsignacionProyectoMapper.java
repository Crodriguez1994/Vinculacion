/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Procesos;

import Modelo.Procesos.AsignacionProyecto;
import ModuloCap.Entidades.AsigProyectos;

/**
 *
 * @author Christian
 */
public interface IAsignacionProyectoMapper {

    public AsignacionProyecto EntityToModel(AsigProyectos asigProyectoEntity);

    public AsigProyectos ModelToEntity(AsignacionProyecto asigProyecto);

}
