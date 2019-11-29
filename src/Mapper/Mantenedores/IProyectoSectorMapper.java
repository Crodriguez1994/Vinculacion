/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Mantenedores;

import Modelo.Mantenedores.ProyectoSector;
import ModuloCap.Entidades.AsigProyectoSector;

/**
 *
 * @author Christian
 */
public interface IProyectoSectorMapper {

    public ProyectoSector EntiyToModel(AsigProyectoSector proyectosectorEntity);

    public AsigProyectoSector ModelToEntity(ProyectoSector proyectosector);
}
