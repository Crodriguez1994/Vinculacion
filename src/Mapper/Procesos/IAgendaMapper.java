/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Procesos;

import Modelo.Procesos.Agenda;
import ModuloCap.Entidades.CabAgendas;

/**
 * 
 */
public interface IAgendaMapper {
    public Agenda EntityToModel (CabAgendas agendaEntity);
    
    public CabAgendas ModelToEntity (Agenda agenda);
    
}
