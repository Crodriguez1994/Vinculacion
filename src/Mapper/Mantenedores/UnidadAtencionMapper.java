/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Mantenedores;

import Modelo.Mantenedores.Proyecto;
import Modelo.Mantenedores.Sector;
import Modelo.Mantenedores.UnidadAtencion;
import ModuloCap.Entidades.Proyectos;
import ModuloCap.Entidades.Sectores;
import ModuloCap.Entidades.UnidadesAtencion;

/**
 *
 * @author Christian
 */
public class UnidadAtencionMapper implements IUnidadAtencionMapper {

    @Override
    public UnidadAtencion EntityToModel(UnidadesAtencion undAtencionEntity) {
        if (undAtencionEntity == null) {
            return null;
        }
        Proyecto proyecto = null;
        if (undAtencionEntity.getProyectoid() != null) {
            proyecto = new Proyecto();
            proyecto.setProyectoid(undAtencionEntity.getProyectoid().getProyectoid());
            proyecto.setNombre(undAtencionEntity.getProyectoid().getNombre().toUpperCase());

        }

        Sector sector = null;
        if (undAtencionEntity.getSectorid() != null) {
            sector = new Sector();
            sector.setSectorid(undAtencionEntity.getSectorid().getSectorid());
            sector.setNombre(undAtencionEntity.getSectorid().getNombre().toUpperCase());
        }

        UnidadAtencion unidadAtencion = new UnidadAtencion();
        unidadAtencion.setUnidadid(undAtencionEntity.getUnidadid());
        unidadAtencion.setProyectoid(proyecto);
        unidadAtencion.setSectorid(sector);
        unidadAtencion.setNombre(undAtencionEntity.getNombre().toUpperCase());
        unidadAtencion.setFecha(undAtencionEntity.getFecha());
        unidadAtencion.setEstado(undAtencionEntity.getEstado().equals("A") ? "ACTIVO" : "INACTIVO");

        return unidadAtencion;

    }

    @Override
    public UnidadesAtencion ModelToEntity(UnidadAtencion undAtencion) {

        if (undAtencion == null) {
            return null;
        }

        Proyectos proyecto = null;
        if (undAtencion.getProyectoid() != null) {
            proyecto = new Proyectos();
            proyecto.setProyectoid(undAtencion.getProyectoid().getProyectoid());
            proyecto.setNombre(undAtencion.getProyectoid().getNombre().toUpperCase());
        }

        Sectores sector = null;
        if (undAtencion.getSectorid() != null) {
            sector = new Sectores();
            sector.setSectorid(undAtencion.getSectorid().getSectorid());
            sector.setNombre(undAtencion.getSectorid().getNombre().toUpperCase());
        }

        UnidadesAtencion unidadAtencion = new UnidadesAtencion();
        unidadAtencion.setUnidadid(undAtencion.getUnidadid());
        unidadAtencion.setProyectoid(proyecto);
        unidadAtencion.setSectorid(sector);
        unidadAtencion.setNombre(undAtencion.getNombre().toUpperCase());
        unidadAtencion.setFecha(undAtencion.getFecha());
        unidadAtencion.setEstado(undAtencion.getEstado().equals("ACTIVO") ? "A" : "I");

        return unidadAtencion;

    }

}
