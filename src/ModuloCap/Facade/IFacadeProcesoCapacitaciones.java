/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Modelo.Mantenedores.Coordinador;
import Modelo.Mantenedores.Facilitador;
import Modelo.Mantenedores.ProyectoSector;
import Modelo.Mantenedores.Sector;
import Modelo.Mantenedores.UnidadAtencion;
import Modelo.Procesos.AsignacionProyecto;
import Modelo.Procesos.Capacitacion;
import Modelo.Procesos.DetaCapacitacion;
import Modelo.Procesos.Modulo;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface IFacadeProcesoCapacitaciones {

    //public void GuardarCapacitacion(Capacitacion capacitacion);
    public void GuardarCapacitacion(Capacitacion capacitacion, List<Facilitador> listFa);

    public void EliminarCapacitacion(Capacitacion capacitacion);

    //-----------Modulos----------------------------------------
    public List<Modulo> GetAllModulos();

    //-----------Asignacion de Proyectos----------------------------------------
    public List<AsignacionProyecto> GetAllAsigProyecto();

    //public List<AsignacionProyecto> GetAsignacionByProyecto(int proyectoid);
    public List<AsignacionProyecto> GetAsignacionByCoordinador(int coordinadorid);

    //-----------Unidades de Atencion----------------------------------------
    public List<UnidadAtencion> GetAllUndAtencion();

    //public List<UnidadAtencion> GetUndAtencionByProyecto(int proyectoid);
    public List<UnidadAtencion> GetUndAtencionBySector(int sectorid);

    public List<Coordinador> GetAllCoordinador();

    public List<Sector> GetAllSector();

    //---------------------------------------------------------------------------------
    public List<ProyectoSector> GetAllAsigProyectoSector();

    public List<ProyectoSector> GetAsignacionByProyecto(int proyectoid);

    public List<ProyectoSector> GetAsignacionBySector(int sectorid);

}
