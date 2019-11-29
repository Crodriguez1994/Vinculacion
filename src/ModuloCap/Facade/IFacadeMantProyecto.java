/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Modelo.Mantenedores.Proyecto;
import Modelo.Mantenedores.ProyectoSector;
import Modelo.Mantenedores.Sector;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface IFacadeMantProyecto {

    public void GuardarProyecto(Proyecto proyecto,List<Sector> listaSector);

    public void EliminarProyecto(Proyecto proyecto);

    public List<Proyecto> GetAllProyectos();

    public List<ProyectoSector> GetAllAsigProyectoSector();

    public List<ProyectoSector> GetAsigByProyecto(int proyectoid);

    public List<ProyectoSector> GetAsigBySector(int sectorid);

    public List<Sector> GetAllSectores();
}
