/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Procesos;

import Modelo.Procesos.DetaInscripcion;
import ModuloCap.Entidades.DetaInscripciones;

/**
 * 
 */
public interface IDetaInscripcionMapper {
    
    public DetaInscripcion EntityToModel (DetaInscripciones detainscripcionEntity);
    
    public DetaInscripciones ModelToEntity(DetaInscripcion detainscripcion);
}
