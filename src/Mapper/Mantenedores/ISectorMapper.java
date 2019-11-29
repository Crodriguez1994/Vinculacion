/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Mantenedores;

import Modelo.Mantenedores.Sector;
import ModuloCap.Entidades.Sectores;

/**
 *
 * @author Christian
 */
public interface ISectorMapper {

    public Sector EntiyToModel(Sectores sectoresEntity);

    public Sectores ModelToEntity(Sector sector);
}
