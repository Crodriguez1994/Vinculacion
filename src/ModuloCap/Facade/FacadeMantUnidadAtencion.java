/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Mapper.Mantenedores.IProyectoMapper;
import Mapper.Mantenedores.IProyectoSectorMapper;
import Mapper.Mantenedores.IUnidadAtencionMapper;
import Mapper.Mantenedores.ProyectoMapper;
import Mapper.Mantenedores.ProyectoSectorMapper;
import Mapper.Mantenedores.UnidadAtencionMapper;
import Modelo.Mantenedores.Proyecto;
import Modelo.Mantenedores.ProyectoSector;
import Modelo.Mantenedores.UnidadAtencion;
import ModuloCap.Dao.AsigProyectoSectorDAO;
import ModuloCap.Dao.ProyectosDAO;
import ModuloCap.Dao.UndAtencionDAO;
import ModuloCap.Entidades.AsigProyectoSector;
import ModuloCap.Entidades.Proyectos;
import ModuloCap.Entidades.UnidadesAtencion;
import ModuloCap.InterfacesDao.IAsigProyectoSectorDao;
import ModuloCap.InterfacesDao.IProyectosDao;
import ModuloCap.InterfacesDao.IUndAtencionDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class FacadeMantUnidadAtencion implements IFacadeMantUnidadAtencion {

    private final IUndAtencionDao unidadDao;
    private final IProyectosDao proyectoDao;
    private final IAsigProyectoSectorDao proyectosectorDao;

    private final IUnidadAtencionMapper unidadMapper;
    private final IProyectoMapper proyectoMapper;
    private final IProyectoSectorMapper proyectosectorMapper;

    public FacadeMantUnidadAtencion() {
        unidadDao = new UndAtencionDAO();
        proyectoDao = new ProyectosDAO();
        proyectosectorDao = new AsigProyectoSectorDAO();

        unidadMapper = new UnidadAtencionMapper();
        proyectoMapper = new ProyectoMapper();
        proyectosectorMapper = new ProyectoSectorMapper();

    }

    @Override
    public void GuardarUnidad(UnidadAtencion unidadatencion) {
        UnidadesAtencion unidades = unidadMapper.ModelToEntity(unidadatencion);
        if (unidades.getUnidadid() == 0) {
            System.out.println("GUARDO!!!!!!!!!!");
            unidadDao.Guardar(unidades);
        } else {
            System.out.println("MODIFICO!!!!!!!!!!");
            unidadDao.Modificar(unidades);
        }
    }

    @Override
    public void EliminarUnidad(UnidadAtencion unidadatencion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UnidadAtencion> GetAllUnidad() {
        List<UnidadAtencion> unidades = new ArrayList<>();
        List<UnidadesAtencion> entities = unidadDao.getUndAtencionList();
        for (UnidadesAtencion entity : entities) {
            UnidadAtencion unidad = unidadMapper.EntityToModel(entity);
            unidades.add(unidad);
        }
        return unidades;
    }

    @Override
    public List<ProyectoSector> GetAllAsigProyectoSector() {
        List<ProyectoSector> proyectoSector = new ArrayList();
        List<AsigProyectoSector> entities = proyectosectorDao.getAsigProyectosSectorlist();
        for (AsigProyectoSector entity : entities) {
            ProyectoSector asig = proyectosectorMapper.EntiyToModel(entity);
            proyectoSector.add(asig);
        }
        return proyectoSector;
    }

    @Override
    public List<ProyectoSector> GetAsignacionByProyecto(int proyectoid) {
        List<ProyectoSector> proyectoSector = new ArrayList();
        List<AsigProyectoSector> entities = proyectosectorDao.getAsigProyectosByProyecto(proyectoid);
        for (AsigProyectoSector entity : entities) {
            ProyectoSector asig = proyectosectorMapper.EntiyToModel(entity);
            proyectoSector.add(asig);
        }
        return proyectoSector;
    }

    @Override
    public List<ProyectoSector> GetAsignacionBySector(int sectorid) {
        List<ProyectoSector> proyectoSector = new ArrayList();
        List<AsigProyectoSector> entities = proyectosectorDao.getAsigProyectosBySector(sectorid);
        for (AsigProyectoSector entity : entities) {
            ProyectoSector asig = proyectosectorMapper.EntiyToModel(entity);
            proyectoSector.add(asig);
        }
        return proyectoSector;
    }

    @Override
    public List<Proyecto> GetAllProyecto() {
        List<Proyecto> proyectos = new ArrayList<>();
        List<Proyectos> entities = proyectoDao.getProyectoslist();
        for (Proyectos entity : entities) {
            Proyecto proyecto = proyectoMapper.EntiyToModel(entity);
            proyectos.add(proyecto);
        }
        return proyectos;
    }
}
