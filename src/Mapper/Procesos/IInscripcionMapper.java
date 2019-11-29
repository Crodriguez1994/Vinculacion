/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Procesos;

import Modelo.Procesos.Inscripcion;
import ModuloCap.Entidades.CabInscripciones;

/**
 *
 
 */
public interface IInscripcionMapper {
    public Inscripcion EntityToModel (CabInscripciones inscripcionEntity);
    
    public CabInscripciones ModelToEntity(Inscripcion inscripcion);
}
