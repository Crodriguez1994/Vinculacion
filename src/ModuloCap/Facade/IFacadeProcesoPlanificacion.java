/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Modelo.Procesos.PlanificacionActividad;
import java.util.List;

/**
 *
 * @author antho
 */
public interface IFacadeProcesoPlanificacion {
    
    public void GuardarPlanificacion (PlanificacionActividad planificacion);
    
    public void EliminarPlanificacion (PlanificacionActividad planificacion);
    
    public List<PlanificacionActividad> GetAllPlanificacion();
    
}
