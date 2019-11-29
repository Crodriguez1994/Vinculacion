/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Mapper.Mantenedores.IProyectoMapper;
import Mapper.Mantenedores.IProyectoSectorMapper;
import Mapper.Mantenedores.ISectorMapper;
import Mapper.Mantenedores.ProyectoMapper;
import Mapper.Mantenedores.ProyectoSectorMapper;
import Mapper.Mantenedores.SectorMapper;
import Modelo.Mantenedores.Proyecto;
import Modelo.Mantenedores.ProyectoPK;
import Modelo.Mantenedores.ProyectoSector;
import Modelo.Mantenedores.Sector;
import ModuloCap.Dao.AsigProyectoSectorDAO;
import ModuloCap.Dao.ProyectosDAO;
import ModuloCap.Dao.SectoresDAO;
import ModuloCap.Entidades.AsigProyectoSector;
import ModuloCap.Entidades.Proyectos;
import ModuloCap.Entidades.Sectores;
import ModuloCap.InterfacesDao.IAsigProyectoSectorDao;
import ModuloCap.InterfacesDao.IProyectosDao;
import ModuloCap.InterfacesDao.ISectoresDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christian
 */
public class FacadeMantProyectos implements IFacadeMantProyecto {

    //DAO
    private final IProyectosDao proyectoDao;
    private final IAsigProyectoSectorDao proyectosectorDao;
    private final ISectoresDao sectorDao;

    //DTO    
    private final IProyectoSectorMapper proyectosectorMapper;
    private final IProyectoMapper proyectoMapper;
    private final ISectorMapper sectorMapper;

    public FacadeMantProyectos() {
        //DAO
        proyectoDao = new ProyectosDAO();
        proyectosectorDao = new AsigProyectoSectorDAO();
        sectorDao = new SectoresDAO();
        //DTO

        sectorMapper = new SectorMapper();
        proyectosectorMapper = new ProyectoSectorMapper();
        proyectoMapper = new ProyectoMapper();
    }

    @Override
    public void GuardarProyecto(Proyecto proyecto,List<Sector> listaSector) {
        int contD =1;
        ProyectoPK  pk = new ProyectoPK();
        ProyectoSector ps = new ProyectoSector();
        Proyectos proyectos = proyectoMapper.ModelToEntity(proyecto);
        for(Sector s :listaSector){
            ps.setAsigid(contD);
            pk.setAsigid(contD);
            ps.setCompuestaPk(pk);
            ps.setSector(s);
            AsigProyectoSector asig = proyectosectorMapper.ModelToEntity(ps);
            proyectos.addAgregar(asig);
            contD++;
        }
        
        if (proyectos.getProyectoid() == 0) {
            proyectoDao.Guardar(proyectos);
        } else {
            proyectoDao.Modificar(proyectos);
        }
    }

    @Override
    public void EliminarProyecto(Proyecto proyecto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Proyecto> GetAllProyectos() {
        List<Proyecto> proyectos = new ArrayList<>();
        List<Proyectos> entities = proyectoDao.getProyectoslist();
        for (Proyectos entity : entities) {
            Proyecto proyecto = proyectoMapper.EntiyToModel(entity);
            proyectos.add(proyecto);
        }
        return proyectos;
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
    public List<ProyectoSector> GetAsigByProyecto(int proyectoid) {
        List<ProyectoSector> proyectoSector = new ArrayList();
        List<AsigProyectoSector> entities = proyectosectorDao.getAsigProyectosByProyecto(proyectoid);
        for (AsigProyectoSector entity : entities) {
            ProyectoSector asig = proyectosectorMapper.EntiyToModel(entity);
            proyectoSector.add(asig);
        }
        return proyectoSector;
    }

    @Override
    public List<ProyectoSector> GetAsigBySector(int sectorid) {
        List<ProyectoSector> proyectoSector = new ArrayList();
        List<AsigProyectoSector> entities = proyectosectorDao.getAsigProyectosBySector(sectorid);
        for (AsigProyectoSector entity : entities) {
            ProyectoSector asig = proyectosectorMapper.EntiyToModel(entity);
            proyectoSector.add(asig);
        }
        return proyectoSector;
    }

    @Override
    public List<Sector> GetAllSectores() {
        List<Sector> sectores = new ArrayList<>();
        List<Sectores> entities = sectorDao.getSectoreslist();
        for (Sectores entity : entities) {
            Sector sector = sectorMapper.EntiyToModel(entity);
            sectores.add(sector);
        }
        return sectores;
    }

}
