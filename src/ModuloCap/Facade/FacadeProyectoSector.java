/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Mapper.Mantenedores.IProyectoSectorMapper;
import Mapper.Mantenedores.ProyectoSectorMapper;
import Modelo.Mantenedores.ProyectoSector;
import ModuloCap.Dao.AsigProyectoSectorDAO;
import ModuloCap.Entidades.AsigProyectoSector;
import ModuloCap.InterfacesDao.IAsigProyectoSectorDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christian
 */
public class FacadeProyectoSector implements IFacadeProyectoSector {
    //DAO

    private final IAsigProyectoSectorDao proyectosectorDao;
    //DTO    
    private final IProyectoSectorMapper proyectosectorMapper;
    
    public FacadeProyectoSector() {
        proyectosectorDao = new AsigProyectoSectorDAO();
        proyectosectorMapper = new ProyectoSectorMapper();
    }
    
    @Override
    public void GuardarProyectoSector(FacadeProyectoSector capacitacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void EliminarProyectoSector(FacadeProyectoSector capacitacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<ProyectoSector> GetAllModulos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
}
