/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Procesos;

import Modelo.Procesos.DetaAgenda;
import ModuloCap.Entidades.DetaAgendas;

/**
 * 
 */
public interface IDetaAgendaMapper {
    
    public DetaAgenda EntityToModel(DetaAgendas detaagendaEntity);
    
    public DetaAgendas ModelToEntity(DetaAgenda detaagenda);
    
}
