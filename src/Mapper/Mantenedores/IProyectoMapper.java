/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Mantenedores;

import Modelo.Mantenedores.Proyecto;
import ModuloCap.Entidades.Proyectos;

/**
 *
 * @author Christian
 */
public interface IProyectoMapper {

    public Proyecto EntiyToModel(Proyectos proyectoEntity);

    public Proyectos ModelToEntity(Proyecto proyecto);
}
