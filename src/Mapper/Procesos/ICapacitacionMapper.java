/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Procesos;

import Modelo.Procesos.Capacitacion;
import ModuloCap.Entidades.CabCapacitaciones;

/**
 *
 * @author Christian
 */
public interface ICapacitacionMapper {

    public Capacitacion EntityToModel(CabCapacitaciones capacitacionEntity);

    public CabCapacitaciones ModelToEntity(Capacitacion capacitacion);
}
