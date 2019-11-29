/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Procesos;

import Modelo.Procesos.Modulo;
import ModuloCap.Entidades.ModulosCapacitaciones;

/**
 *
 * @author Christian
 */
public interface IModuloMapper {

    public Modulo EntityToModel(ModulosCapacitaciones moduloEntity);

    public ModulosCapacitaciones ModelToEntity(Modulo modulo);
}
