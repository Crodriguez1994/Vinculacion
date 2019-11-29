/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Procesos;

import Modelo.Procesos.Agenda;
import Modelo.Procesos.Capacitacion;
import Modelo.Procesos.Modulo;
import Modelo.Procesos.ModuloPK;
import ModuloCap.Entidades.CabAgendas;
import ModuloCap.Entidades.ModulosCapacitaciones;
import ModuloCap.Entidades.ModulosCapacitacionesPK;

/**
 *
 */
public class AgendaMapper implements IAgendaMapper {

    @Override
    public Agenda EntityToModel(CabAgendas agendaEntity) {
        if (agendaEntity == null) {
            return null;
        }
        Capacitacion capacitacion = null;
        if(agendaEntity.getModuloid().getCabCapid()!=null){
            capacitacion = new Capacitacion();
            capacitacion.setCabcapid(agendaEntity.getModuloid().getCabCapid().getCabcapid());
            capacitacion.setNombre(agendaEntity.getModuloid().getCabCapid().getNombre().toUpperCase());
        }

        ModuloPK  modpk = null;
        if(agendaEntity.getModuloid().getModulocap()!= null){
            modpk =new ModuloPK();
            modpk.setCabcapid(agendaEntity.getModuloid().getModulocap().getCabcapid());
            modpk.setModuloid(agendaEntity.getModuloid().getModulocap().getModuloid());
        }
        
        Modulo modulo = null;
        if (agendaEntity.getModuloid() != null) {
            modulo = new Modulo();
            modulo.setCompuestaPk(modpk);
            modulo.setNombre(agendaEntity.getModuloid().getNombre().toUpperCase());
            modulo.setCabCapid(capacitacion);
        }
        
        Agenda agenda = new Agenda();
        agenda.setCabagendaid(agendaEntity.getCabagendaid());
        agenda.setDia(agendaEntity.getDia());
        agenda.setEstado(agendaEntity.getEstado().equals("A") ? "APROBADO" : "INACTIVO");
        agenda.setFecha(agendaEntity.getFecha());
        agenda.setModuloid(modulo);
        return agenda;
    }

    @Override
    public CabAgendas ModelToEntity(Agenda agenda) {
        if (agenda == null) {
            return null;
        }
       
        ModulosCapacitacionesPK compuestaPk = null;
        if (agenda.getModuloid().getCompuestaPk() != null) {
            compuestaPk = new ModulosCapacitacionesPK();
            compuestaPk.setModuloid(agenda.getModuloid().getCompuestaPk().getModuloid());
            compuestaPk.setCabcapid(agenda.getModuloid().getCompuestaPk().getCabcapid());
        }

        ModulosCapacitaciones modulocapacitacion = null;
        if (agenda.getModuloid() != null) {
            modulocapacitacion = new ModulosCapacitaciones();
            modulocapacitacion.setModulocap(compuestaPk);
            modulocapacitacion.setNombre(agenda.getModuloid().getNombre().toUpperCase());
        }

        CabAgendas agendas = new CabAgendas();
        agendas.setCabagendaid(agenda.getCabagendaid());
        agendas.setDia(agenda.getDia());
        agendas.setEstado(agenda.getEstado().equals("APROBADO") ? "A" : "I");
        agendas.setFecha(agenda.getFecha());
        agendas.setModuloid(modulocapacitacion);

        return agendas;
    }

}
