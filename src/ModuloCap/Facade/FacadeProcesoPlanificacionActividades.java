/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Mapper.Procesos.AgendaMapper;
import Mapper.Procesos.IAgendaMapper;
import Mapper.Procesos.IPlanificacionMapper;
import Mapper.Procesos.PlanificacionActividadMapper;
import Modelo.Procesos.PlanificacionActividad;
import ModuloCap.Dao.CabAgendasDAO;
import ModuloCap.Dao.PlanfActividadDAO;
import ModuloCap.Entidades.PlanificacionActividades;
import ModuloCap.InterfacesDao.ICabAgendasDao;
import ModuloCap.InterfacesDao.IPlanfActividadDao;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class FacadeProcesoPlanificacionActividades implements IFacadeProcesoPlanificacion{

    private final ICabAgendasDao agendaDao;
    private final IPlanfActividadDao planificacionDao;
    
    
    private final IAgendaMapper agendaMapper;
    private final IPlanificacionMapper planificacionMapper;
    
    
    public FacadeProcesoPlanificacionActividades() {
        agendaDao=new CabAgendasDAO();
        planificacionDao=new PlanfActividadDAO();
        agendaMapper=new AgendaMapper();
        planificacionMapper=new PlanificacionActividadMapper();
    }
    
    @Override
    public void GuardarPlanificacion(PlanificacionActividad planificacion) {
        PlanificacionActividades planifi=planificacionMapper.ModelToEntity(planificacion);
        if(planifi.getPlanificacionid()==0){
            System.out.println("GUARDO!!!!!!!!!!");
            planificacionDao.Guardar(planifi);
        }else{
            System.out.println("MODIFICO!!!!!!!!!!");
            planificacionDao.Modificar(planifi);
        }        
    }

    @Override
    public void EliminarPlanificacion(PlanificacionActividad planificacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PlanificacionActividad> GetAllPlanificacion() {
        List<PlanificacionActividad>planificacion=new ArrayList<>();
        List<PlanificacionActividades>entities=planificacionDao.getPlanfActividadeslist();
        for(PlanificacionActividades entity:entities){
            PlanificacionActividad planificac=planificacionMapper.EntityToModel(entity);
            planificacion.add(planificac);
        }
        return planificacion;
    }
    
}
