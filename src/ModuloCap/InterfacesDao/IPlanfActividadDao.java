/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.InterfacesDao;

import ModuloCap.Entidades.PlanificacionActividades;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface IPlanfActividadDao {

    public PlanificacionActividades getPlanfActividadesId(int PlanfId);

    public void Guardar(PlanificacionActividades planfActividad);

    public void Modificar(PlanificacionActividades planfActividad);

    public void Eliminar(PlanificacionActividades planfActividad);

    public List<PlanificacionActividades> getPlanfActividadeslist();
}
