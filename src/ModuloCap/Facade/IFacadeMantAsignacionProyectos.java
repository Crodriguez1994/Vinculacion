/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Modelo.Mantenedores.Coordinador;
import Modelo.Mantenedores.Proyecto;
import Modelo.Procesos.AsignacionProyecto;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface IFacadeMantAsignacionProyectos {

    public void Guardar(AsignacionProyecto asigProyecto, List<Proyecto> listaproyecto);

    public void Eliminar(AsignacionProyecto asigProyecto);

    public List<AsignacionProyecto> GetAllAsignacionProyectos();

    public List<Proyecto> GetAllProyectos();

    public List<Coordinador> GetAllCoordinadores();
}
