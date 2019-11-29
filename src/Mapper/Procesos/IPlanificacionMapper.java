/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Procesos;

import Modelo.Procesos.PlanificacionActividad;
import ModuloCap.Entidades.PlanificacionActividades;

/**
 *
 * @author antho
 */
public interface IPlanificacionMapper {
    public PlanificacionActividad EntityToModel (PlanificacionActividades planificacionEntity);
    
    public PlanificacionActividades ModelToEntity(PlanificacionActividad planificacionactividad);
}
