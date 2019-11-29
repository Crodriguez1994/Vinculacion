/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Mantenedores;

import Modelo.Mantenedores.Horario;
import ModuloCap.Entidades.CabHorarios;

/**
 *
 * @author antho
 */
public interface IHorarioMapper {
    
    public Horario EntiyToModel (CabHorarios horarioEntity);
    
    public CabHorarios ModelToEntity (Horario horario);
    
    
    
}
