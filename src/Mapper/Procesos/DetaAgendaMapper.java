/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Procesos;

import Modelo.Procesos.Agenda;
import Modelo.Procesos.AgendaPK;
import Modelo.Procesos.DetaAgenda;
import ModuloCap.Entidades.DetaAgendas;
import ModuloCap.Entidades.DetaAgendasPK;

/**
 * 
 */
public class DetaAgendaMapper implements IDetaAgendaMapper{

    @Override
    public DetaAgenda EntityToModel(DetaAgendas detaagendaEntity) {
        if(detaagendaEntity==null){
            return null;
        }
        AgendaPK agepk = null;
        if(detaagendaEntity.getDetagendapk()!=null){
            agepk = new AgendaPK();
            agepk.setCabagendaid(detaagendaEntity.getDetagendapk().getCabagendaid());
            agepk.setDetagendaid(detaagendaEntity.getDetagendapk().getDetagendaid());
        }

        DetaAgenda detaagenda=new DetaAgenda();
        detaagenda.setCompuestaPk(agepk);
        detaagenda.setActividad(detaagendaEntity.getActividad().toUpperCase());
        detaagenda.setEstrategia(detaagendaEntity.getEstrategia().toUpperCase());
        detaagenda.setHorainicio(detaagendaEntity.getHorainicio().toUpperCase());
        detaagenda.setHorafin(detaagendaEntity.getHorafin());
        detaagenda.setResponsable(detaagendaEntity.getResponsable().toUpperCase());
        return detaagenda;
    }

    @Override
    public DetaAgendas ModelToEntity(DetaAgenda detaagenda) {
        if(detaagenda==null){
            return null;
        }
        
        DetaAgendasPK compuestaPk= null;
        if(detaagenda.getCompuestaPk()!= null){
            compuestaPk = new DetaAgendasPK();
            compuestaPk.setDetagendaid(detaagenda.getDetagendaid());
        }
        
        DetaAgendas detagenda=new DetaAgendas();
        detagenda.setDetagendapk(compuestaPk);
        detagenda.setActividad(detaagenda.getActividad().toUpperCase());
        detagenda.setEstrategia(detaagenda.getEstrategia().toUpperCase());
        detagenda.setHorainicio(detaagenda.getHorainicio().toUpperCase());
        detagenda.setHorafin(detaagenda.getHorafin());
        detagenda.setResponsable(detaagenda.getResponsable().toUpperCase());
        return detagenda;
    }
    
}
