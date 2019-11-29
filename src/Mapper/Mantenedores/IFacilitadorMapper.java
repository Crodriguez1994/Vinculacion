/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Mantenedores;

import Modelo.Mantenedores.Facilitador;
import ModuloCap.Entidades.Facilitadores;

/**
 *
 * @author Christian
 */
public interface IFacilitadorMapper{

    public Facilitador EntiyToModel(Facilitadores facilitadorEntity);

    public Facilitadores ModelToEntity(Facilitador facilitador);

}
