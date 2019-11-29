/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Procesos;

import Modelo.Procesos.DetaCapacitacion;
import ModuloCap.Entidades.DetaCapacitaciones;

/**
 *
 * @author Christian
 */
public interface IDetaCapacitacionMapper {

    public DetaCapacitacion EntityToModel(DetaCapacitaciones detacapacitacionEntity);

    public DetaCapacitaciones ModelToEntity(DetaCapacitacion detacapacitacion);
}
