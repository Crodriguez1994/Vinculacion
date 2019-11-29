/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Mapper.Mantenedores.CoordinadorMapper;
import Mapper.Mantenedores.FacilitadorMapper;
import Mapper.Mantenedores.ICoordinadorMapper;
import Mapper.Mantenedores.IFacilitadorMapper;
import Mapper.Mantenedores.IProyectoSectorMapper;
import Mapper.Mantenedores.ISectorMapper;
import Mapper.Mantenedores.IUnidadAtencionMapper;
import Mapper.Mantenedores.ProyectoSectorMapper;
import Mapper.Mantenedores.SectorMapper;
import Mapper.Mantenedores.UnidadAtencionMapper;
import Mapper.Procesos.AsignacionProyectoMapper;
import Mapper.Procesos.CapacitacionMapper;
import Mapper.Procesos.DetaCapacitacionMapper;
import Mapper.Procesos.IAsignacionProyectoMapper;
import Mapper.Procesos.ICapacitacionMapper;
import Mapper.Procesos.IDetaCapacitacionMapper;
import Mapper.Procesos.IModuloMapper;
import Mapper.Procesos.ModuloMapper;
import Modelo.Mantenedores.Coordinador;
import Modelo.Mantenedores.Facilitador;
import Modelo.Mantenedores.ProyectoSector;
import Modelo.Mantenedores.Sector;
import Modelo.Mantenedores.UnidadAtencion;
import Modelo.Procesos.AsignacionProyecto;
import Modelo.Procesos.Capacitacion;
import Modelo.Procesos.CapacitacionPK;
import Modelo.Procesos.DetaCapacitacion;
import Modelo.Procesos.Modulo;
import Modelo.Procesos.ModuloPK;
import ModuloCap.Dao.AsigProyectoSectorDAO;
import ModuloCap.Dao.AsigProyectosDAO;
import ModuloCap.Dao.CabCapacitacionesDAO;
import ModuloCap.Dao.CoordinadoresDAO;
import ModuloCap.Dao.DetaCapacitacionesDAO;
import ModuloCap.Dao.FacilitadoresDAO;
import ModuloCap.Dao.ModuloCapDAO;
import ModuloCap.Dao.SectoresDAO;
import ModuloCap.Dao.UndAtencionDAO;
import ModuloCap.Entidades.AsigProyectoSector;
import ModuloCap.Entidades.AsigProyectos;
import ModuloCap.Entidades.CabCapacitaciones;
import ModuloCap.Entidades.Coordinadores;
import ModuloCap.Entidades.DetaCapacitaciones;
import ModuloCap.Entidades.ModulosCapacitaciones;
import ModuloCap.Entidades.Sectores;
import ModuloCap.Entidades.UnidadesAtencion;
import ModuloCap.InterfacesDao.IAsigProyectoSectorDao;
import ModuloCap.InterfacesDao.IAsigProyectosDao;
import ModuloCap.InterfacesDao.ICabCapacitacionesDao;
import ModuloCap.InterfacesDao.ICoordinadoresDao;
import ModuloCap.InterfacesDao.IDetaCapacitacionesDao;
import ModuloCap.InterfacesDao.IFacilitadoresDao;
import ModuloCap.InterfacesDao.IModuloCapDao;
import ModuloCap.InterfacesDao.ISectoresDao;
import ModuloCap.InterfacesDao.IUndAtencionDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christian
 */
public class FacadeProcesoCapacitaciones implements IFacadeProcesoCapacitaciones {

    //DAO
    private final ICabCapacitacionesDao cabCapacitacionDao;
    private final IDetaCapacitacionesDao detaCapacitacionDao;
    private final IModuloCapDao moduloDao;
    private final IAsigProyectosDao asignacionDao;
    private final IUndAtencionDao undAtencionDao;
    private final ICoordinadoresDao coordinadorDao;
    private final ISectoresDao sectoresDao;
    private final IAsigProyectoSectorDao proyectosectorDao;
    private final IFacilitadoresDao facilitadorDao;

    //DTO
    private final ICapacitacionMapper capacitacionMapper;
    private final IDetaCapacitacionMapper detaCapacitacionMapper;
    private final IModuloMapper moduloMapper;
    private final IAsignacionProyectoMapper asignacionMapper;
    private final IUnidadAtencionMapper undAtencionMapper;
    private final ICoordinadorMapper coordinadorMapper;
    private final ISectorMapper sectorMapper;
    private final IProyectoSectorMapper proyectosectorMapper;
    private final IFacilitadorMapper facilitadorMapper;
   

    public FacadeProcesoCapacitaciones() {
        //DAO
        cabCapacitacionDao = new CabCapacitacionesDAO();
        detaCapacitacionDao = new DetaCapacitacionesDAO();
        moduloDao = new ModuloCapDAO();
        asignacionDao = new AsigProyectosDAO();
        undAtencionDao = new UndAtencionDAO();
        coordinadorDao = new CoordinadoresDAO();
        sectoresDao = new SectoresDAO();
        proyectosectorDao = new AsigProyectoSectorDAO();
        facilitadorDao = new FacilitadoresDAO();
        //DTO
        capacitacionMapper = new CapacitacionMapper();
        detaCapacitacionMapper = new DetaCapacitacionMapper();
        moduloMapper = new ModuloMapper();
        asignacionMapper = new AsignacionProyectoMapper();
        undAtencionMapper = new UnidadAtencionMapper();
        coordinadorMapper = new CoordinadorMapper();
        sectorMapper = new SectorMapper();
        proyectosectorMapper = new ProyectoSectorMapper();
        facilitadorMapper = new FacilitadorMapper();
       
    }

    @Override
    public List<Modulo> GetAllModulos() {
        List<Modulo> modulos = new ArrayList();
        List<ModulosCapacitaciones> entities = moduloDao.getModulocaplist();
        for (ModulosCapacitaciones entity : entities) {
            Modulo modulo = moduloMapper.EntityToModel(entity);
            modulos.add(modulo);
        }
        return modulos;
    }

    @Override
    public void GuardarCapacitacion(Capacitacion capacitacion, List<Facilitador> listaFa) {
        int contD = 1;
        ModuloPK mpk = new ModuloPK();
        CapacitacionPK dtpk = new CapacitacionPK();
        DetaCapacitacion detaCap = new DetaCapacitacion();
        CabCapacitaciones cap = capacitacionMapper.ModelToEntity(capacitacion);

        for (Facilitador f : listaFa) {
            detaCap.setDetaCapacitacionid(contD);
            dtpk.setDetacapid(contD);
            detaCap.setCompuestaPk(dtpk);
            detaCap.setFacilitadorid(f);
            DetaCapacitaciones deta = detaCapacitacionMapper.ModelToEntity(detaCap);
            cap.addDetalle(deta);
            contD++;
        }
        
        for (Modulo m : capacitacion.getListaModCap()) {
            mpk.setModuloid(m.getModuloid());
            m.setCompuestaPk(mpk);
            ModulosCapacitaciones detaModulo = moduloMapper.ModelToEntity(m);
            cap.addDetalleMod(detaModulo);
        }
        
        cabCapacitacionDao.Guardar(cap);
    }

    @Override
    public void EliminarCapacitacion(Capacitacion capacitacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public List<AsignacionProyecto> GetAsignacionByCoordinador(int coordinadorid) {
        List<AsignacionProyecto> asignaciones = new ArrayList();
        List<AsigProyectos> entities = asignacionDao.getAsigProyectosByCoordinador(coordinadorid);
        for (AsigProyectos entity : entities) {
            AsignacionProyecto asignacion = asignacionMapper.EntityToModel(entity);
            asignaciones.add(asignacion);
        }
        return asignaciones;
    }

    @Override
    public List<UnidadAtencion> GetUndAtencionBySector(int sectorid) {
        List<UnidadAtencion> undAtencion = new ArrayList();
        List<UnidadesAtencion> entities = undAtencionDao.getUndAtencionBySector(sectorid);
        for (UnidadesAtencion entity : entities) {
            UnidadAtencion unidad = undAtencionMapper.EntityToModel(entity);
            undAtencion.add(unidad);
        }
        return undAtencion;
    }

    @Override
    public List<AsignacionProyecto> GetAllAsigProyecto() {
        List<AsignacionProyecto> asignaciones = new ArrayList();
        List<AsigProyectos> entities = asignacionDao.getAsigProyectoslist();
        for (AsigProyectos entity : entities) {
            AsignacionProyecto asignacion = asignacionMapper.EntityToModel(entity);
            asignaciones.add(asignacion);
        }
        return asignaciones;
    }

    @Override
    public List<UnidadAtencion> GetAllUndAtencion() {
        List<UnidadAtencion> undAtencion = new ArrayList();
        List<UnidadesAtencion> entities = undAtencionDao.getUndAtencionList();
        for (UnidadesAtencion entity : entities) {
            UnidadAtencion unidad = undAtencionMapper.EntityToModel(entity);
            undAtencion.add(unidad);
        }
        return undAtencion;
    }

    @Override
    public List<Coordinador> GetAllCoordinador() {
        List<Coordinador> coordinadores = new ArrayList();
        List<Coordinadores> entities = coordinadorDao.getCoordinadoreslist();
        for (Coordinadores entity : entities) {
            Coordinador coordinador = coordinadorMapper.EntiyToModel(entity);
            coordinadores.add(coordinador);
        }
        return coordinadores;
    }

    @Override
    public List<Sector> GetAllSector() {
        List<Sector> sectores = new ArrayList();
        List<Sectores> entities = sectoresDao.getSectoreslist();
        for (Sectores entity : entities) {
            Sector sector = sectorMapper.EntiyToModel(entity);
            sectores.add(sector);
        }
        return sectores;
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

}
