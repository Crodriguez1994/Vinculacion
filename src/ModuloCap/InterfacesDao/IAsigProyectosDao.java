/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.InterfacesDao;

import ModuloCap.Entidades.AsigProyectos;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface IAsigProyectosDao {

    public AsigProyectos getAsigProyectoId(int asigproyectoid);

    public void Guardar(AsigProyectos asigproyecto);

    public void Modificar(AsigProyectos asigproyecto);

    public void Eliminar(AsigProyectos asigproyecto);

    public List<AsigProyectos> getAsigProyectoslist();

    public List<AsigProyectos> getAsigProyectosByCoordinador(int coordinadorId);

    public List<AsigProyectos> getAsigProyectosByProyecto(int proyectoId);
}
