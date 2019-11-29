/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Mapper.Mantenedores.CoordinadorMapper;
import Mapper.Mantenedores.ICoordinadorMapper;
import Mapper.Mantenedores.IProyectoMapper;
import Mapper.Mantenedores.ProyectoMapper;
import Mapper.Procesos.AsignacionProyectoMapper;
import Mapper.Procesos.IAsignacionProyectoMapper;
import Modelo.Mantenedores.Coordinador;
import Modelo.Mantenedores.Proyecto;
import Modelo.Procesos.AsignacionProyecto;
import ModuloCap.Dao.AsigProyectosDAO;
import ModuloCap.Dao.CoordinadoresDAO;
import ModuloCap.Dao.ProyectosDAO;
import ModuloCap.Entidades.AsigProyectos;
import ModuloCap.Entidades.Coordinadores;
import ModuloCap.Entidades.Proyectos;
import ModuloCap.InterfacesDao.IAsigProyectosDao;
import ModuloCap.InterfacesDao.ICoordinadoresDao;
import ModuloCap.InterfacesDao.IProyectosDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christian
 */
public class FacadeMantAsignacionProyectos implements IFacadeMantAsignacionProyectos {

    //DAO
    private final IAsigProyectosDao asignacionDao;
    private final ICoordinadoresDao coordinadorDao;
    private final IProyectosDao proyectoDao;

    //DTO
    private final IAsignacionProyectoMapper asignacionMapper;
    private final ICoordinadorMapper coordinadorMapper;
    private final IProyectoMapper proyectoMapper;

    public FacadeMantAsignacionProyectos() {
        //DAO
        asignacionDao = new AsigProyectosDAO();
        coordinadorDao = new CoordinadoresDAO();
        proyectoDao = new ProyectosDAO();
        //DTO
        asignacionMapper = new AsignacionProyectoMapper();
        coordinadorMapper = new CoordinadorMapper();
        proyectoMapper = new ProyectoMapper();
    }

    @Override
    public void Guardar(AsignacionProyecto asigProyecto, List<Proyecto> listaproyecto) {
        for (Proyecto pro : listaproyecto) {
            asigProyecto.setProyectoid(pro);
            AsigProyectos asiproyectos = asignacionMapper.ModelToEntity(asigProyecto);
            asignacionDao.Guardar(asiproyectos);
        }

    }

    @Override
    public void Eliminar(AsignacionProyecto asigProyecto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AsignacionProyecto> GetAllAsignacionProyectos() {
        List<AsignacionProyecto> asignaciones = new ArrayList();
        List<AsigProyectos> entities = asignacionDao.getAsigProyectoslist();
        for (AsigProyectos entity : entities) {
            AsignacionProyecto asignacion = asignacionMapper.EntityToModel(entity);
            asignaciones.add(asignacion);
        }
        return asignaciones;
    }

    @Override
    public List<Proyecto> GetAllProyectos() {
        List<Proyecto> proyectos = new ArrayList();
        List<Proyectos> entities = proyectoDao.getProyectoslist();
        for (Proyectos entity : entities) {
            Proyecto proyecto = proyectoMapper.EntiyToModel(entity);
            proyectos.add(proyecto);
        }
        return proyectos;
    }

    @Override
    public List<Coordinador> GetAllCoordinadores() {
        List<Coordinador> coordinadores = new ArrayList();
        List<Coordinadores> entities = coordinadorDao.getCoordinadoreslist();
        for (Coordinadores entity : entities) {
            Coordinador coordinador = coordinadorMapper.EntiyToModel(entity);
            coordinadores.add(coordinador);
        }
        return coordinadores;
    }

}
