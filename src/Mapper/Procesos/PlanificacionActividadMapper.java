/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Procesos;

import Modelo.Procesos.Agenda;
import Modelo.Procesos.PlanificacionActividad;
import ModuloCap.Entidades.CabAgendas;
import ModuloCap.Entidades.PlanificacionActividades;
import java.sql.Date;

/**
 *
 */
public class PlanificacionActividadMapper implements IPlanificacionMapper {

    @Override
    public PlanificacionActividad EntityToModel(PlanificacionActividades planificacionEntity) {
        if (planificacionEntity == null) {
            return null;
        }
        Agenda agenda = null;
        if (planificacionEntity.getCabagendaid() != null) {
            agenda = new Agenda();
            agenda.setCabagendaid(planificacionEntity.getCabagendaid().getCabagendaid());
        }
        PlanificacionActividad planificacion = new PlanificacionActividad();
        planificacion.setPlanificacionid(planificacionEntity.getPlanificacionid());
        planificacion.setActividad(planificacionEntity.getActividad());
        planificacion.setFecha(planificacionEntity.getFecha());
        planificacion.setLugar(planificacionEntity.getLugar());
        planificacion.setObjetivo(planificacionEntity.getObjetivo());
        planificacion.setResultados(planificacionEntity.getResultados());
        planificacion.setTipo(planificacionEntity.getTipo().equals("I") ? "Interno" : "Externo");
        planificacion.setCabagendaid(agenda);
        return planificacion;
    }

    @Override
    public PlanificacionActividades ModelToEntity(PlanificacionActividad planificacionactividad) {
        if (planificacionactividad == null) {
            return null;
        }
        CabAgendas agenda = null;
        if (planificacionactividad.getCabagendaid() != null) {
            agenda = new CabAgendas();
            agenda.setCabagendaid(planificacionactividad.getCabagendaid().getCabagendaid());
        }
        PlanificacionActividades planificaciones = new PlanificacionActividades();
        planificaciones.setPlanificacionid(planificacionactividad.getPlanificacionid());
        planificaciones.setActividad(planificacionactividad.getActividad());
        planificaciones.setFecha(planificacionactividad.getFecha());
        planificaciones.setLugar(planificacionactividad.getLugar());
        planificaciones.setObjetivo(planificacionactividad.getObjetivo());
        planificaciones.setResultados(planificacionactividad.getResultados());
        planificaciones.setTipo(planificacionactividad.getTipo().equals("Interno") ? "I" : "E");
        planificaciones.setCabagendaid(agenda);
        return planificaciones;
    }

}
