/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Modelo.Mantenedores.Proyecto;
import Modelo.Mantenedores.ProyectoSector;
import Modelo.Mantenedores.UnidadAtencion;
import java.util.List;

/**
 *
 * @author antho
 */
public interface IFacadeMantUnidadAtencion {

    public void GuardarUnidad(UnidadAtencion unidadatencion);

    public void EliminarUnidad(UnidadAtencion unidadatencion);

    public List<UnidadAtencion> GetAllUnidad();

    public List<Proyecto> GetAllProyecto();
    
    public List<ProyectoSector> GetAllAsigProyectoSector();

    public List<ProyectoSector> GetAsignacionByProyecto(int proyectoid);

    public List<ProyectoSector> GetAsignacionBySector(int sectorid);
}
