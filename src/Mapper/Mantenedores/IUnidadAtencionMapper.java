/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Mantenedores;

import Modelo.Mantenedores.UnidadAtencion;
import ModuloCap.Entidades.UnidadesAtencion;

/**
 *
 * @author Christian
 */
public interface IUnidadAtencionMapper {

    public UnidadAtencion EntityToModel(UnidadesAtencion undAtencionEntity);

    public UnidadesAtencion ModelToEntity(UnidadAtencion undAtencion);
}
