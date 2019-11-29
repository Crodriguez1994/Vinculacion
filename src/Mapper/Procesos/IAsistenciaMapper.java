/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Procesos;

import Modelo.Procesos.Asistencia;
import ModuloCap.Entidades.CabAsistencias;

/**
 * 
 */
public interface IAsistenciaMapper {
    public Asistencia EntityToModel(CabAsistencias asistenciaEntity);
    
    public CabAsistencias ModelToEntity(Asistencia asistencia);
    
}
