/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Mantenedores;

import Modelo.Mantenedores.DetaHorario;
import ModuloCap.Entidades.DetaHorarios;

/**
 *
 * @author antho
 */
public interface IDetaHorarioMapper {
    
    public DetaHorario EntiyToModel (DetaHorarios detahorarioEntity);
    
    public DetaHorarios ModelToEntity (DetaHorario detahorario);
    
}
