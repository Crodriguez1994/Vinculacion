/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Modelo.Mantenedores.ProyectoSector;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface IFacadeProyectoSector {

    public void GuardarProyectoSector(FacadeProyectoSector capacitacion);

    public void EliminarProyectoSector(FacadeProyectoSector capacitacion);

    public List<ProyectoSector> GetAllModulos();

    public List<ProyectoSector> GetAllAsigProyectoSector();

    public List<ProyectoSector> GetAsigByProyecto(int proyectoid);

    public List<ProyectoSector> GetAsigBySector(int sectorid);

}
