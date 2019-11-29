/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Mantenedores;

import Modelo.Mantenedores.Coordinador;
import ModuloCap.Entidades.Coordinadores;

/**
 *
 * @author Christian
 */
public interface ICoordinadorMapper {

    public Coordinador EntiyToModel(Coordinadores coordinadorEntity);

    public Coordinadores ModelToEntity(Coordinador coordinador);
}
