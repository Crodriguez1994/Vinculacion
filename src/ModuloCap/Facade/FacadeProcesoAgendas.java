/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Mapper.Procesos.AgendaMapper;
import Mapper.Procesos.CapacitacionMapper;
import Mapper.Procesos.DetaAgendaMapper;
import Mapper.Procesos.IAgendaMapper;
import Mapper.Procesos.ICapacitacionMapper;
import Mapper.Procesos.IDetaAgendaMapper;
import Mapper.Procesos.IModuloMapper;
import Mapper.Procesos.ModuloMapper;
import Modelo.Procesos.Agenda;
import Modelo.Procesos.AgendaPK;
import Modelo.Procesos.Capacitacion;
import Modelo.Procesos.DetaAgenda;
import Modelo.Procesos.Modulo;
import ModuloCap.Dao.CabAgendasDAO;
import ModuloCap.Dao.CabCapacitacionesDAO;
import ModuloCap.Dao.DetaAgendasDAO;
import ModuloCap.Dao.ModuloCapDAO;
import ModuloCap.Entidades.CabAgendas;
import ModuloCap.Entidades.CabCapacitaciones;
import ModuloCap.Entidades.DetaAgendas;
import ModuloCap.Entidades.ModulosCapacitaciones;
import ModuloCap.InterfacesDao.ICabAgendasDao;
import ModuloCap.InterfacesDao.ICabCapacitacionesDao;
import ModuloCap.InterfacesDao.IDetaAgendasDao;
import ModuloCap.InterfacesDao.IModuloCapDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class FacadeProcesoAgendas implements IFacadeProcesoAgendas {

    private final ICabAgendasDao agendaDao;
    private final IDetaAgendasDao detagendDao;
    private final ICabCapacitacionesDao capDao;
    private final IModuloCapDao modDao;

    private final IAgendaMapper agendaMapper;
    private final IDetaAgendaMapper detagendaMapper;
    private final ICapacitacionMapper capMapper;
    private final IModuloMapper modMapper;

    public FacadeProcesoAgendas() {
        agendaDao = new CabAgendasDAO();
        detagendDao = new DetaAgendasDAO();
        capDao = new CabCapacitacionesDAO();
        modDao = new ModuloCapDAO();

        agendaMapper = new AgendaMapper();
        detagendaMapper = new DetaAgendaMapper();
        capMapper = new CapacitacionMapper();
        modMapper = new ModuloMapper();
    }

    @Override
    public void GuardarAgenda(Agenda agenda) {
        
        AgendaPK apk = new AgendaPK();
        CabAgendas agend = agendaMapper.ModelToEntity(agenda);
        for (DetaAgenda dtAgenda : agenda.getListaDetaAgenda()) {
            apk.setDetagendaid(dtAgenda.getDetagendaid());
            dtAgenda.setCompuestaPk(apk);
            DetaAgendas detaAgenda = detagendaMapper.ModelToEntity(dtAgenda);
            agend.addDetalle(detaAgenda);
            
        }
        if(agend.getCabagendaid()==0){
            agendaDao.Guardar(agend);
        }else{
            agendaDao.Modificar(agend);
        }
    }

    @Override
    public void EliminarAgenda(Agenda agenda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Agenda> GetAllAgendas() {
        List<Agenda> agendas = new ArrayList<>();
        List<CabAgendas> entities = agendaDao.getCabagendaslist();
        for (CabAgendas entity : entities) {
            Agenda agenda = agendaMapper.EntityToModel(entity);
            agendas.add(agenda);
        }
        return agendas;
    }

    @Override
    public List<Capacitacion> GetAllCapacitaciones() {
        List<Capacitacion> capacitaciones = new ArrayList<>();
        List<CabCapacitaciones> entities = capDao.getCabcapacitacioneslist();
        for (CabCapacitaciones entity : entities) {
            Capacitacion capacitacion = capMapper.EntityToModel(entity);
            capacitaciones.add(capacitacion);
        }
        return capacitaciones;
    }

    @Override
    public List<Modulo> GetModulosByCapapacitacion(int CapacitacionId) {
        List<Modulo> modulos = new ArrayList<>();
        List<ModulosCapacitaciones> entities = modDao.getModuloByCabCap(CapacitacionId);
        for (ModulosCapacitaciones entity : entities) {
            Modulo modulo = modMapper.EntityToModel(entity);
            modulos.add(modulo);
        }
        return modulos;
    }

    @Override
    public List<DetaAgenda> GetDetaAgendaByCabecera(int cabeceraId) {
        List<DetaAgenda> detaAgenda = new ArrayList<>();
        List<DetaAgendas> entities = detagendDao.getDetAgendaslist(cabeceraId);
        for (DetaAgendas entity : entities) {
            DetaAgenda deta = detagendaMapper.EntityToModel(entity);
            detaAgenda.add(deta);
        }
        return detaAgenda;
    }

}
