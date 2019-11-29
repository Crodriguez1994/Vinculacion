/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.InterfacesDao;

import ModuloCap.Entidades.AsigProyectoSector;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface IAsigProyectoSectorDao {

    public AsigProyectoSector getAsigProyectoId(int asigproyectosectorid);

    public void Guardar(AsigProyectoSector asigproyectosector);

    public void Modificar(AsigProyectoSector asigproyectosector);

    public void Eliminar(AsigProyectoSector asigproyectosector);

    public List<AsigProyectoSector> getAsigProyectosSectorlist();

    public List<AsigProyectoSector> getAsigProyectosBySector(int sectorId);

    public List<AsigProyectoSector> getAsigProyectosByProyecto(int proyectoId);
}
