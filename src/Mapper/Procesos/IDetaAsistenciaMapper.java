/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Procesos;

import Modelo.Procesos.DetaAsistencia;
import ModuloCap.Entidades.DetaAsistencias;

/**
 *
 * @author antho
 */
public interface IDetaAsistenciaMapper {
    
    public DetaAsistencia EntityToModel(DetaAsistencias detaEntity);
    
    public DetaAsistencias ModelToEntity (DetaAsistencia detaasistencia);
    
}
