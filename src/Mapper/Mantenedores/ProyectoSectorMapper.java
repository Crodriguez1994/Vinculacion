/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Mantenedores;

import Modelo.Mantenedores.Proyecto;
import Modelo.Mantenedores.ProyectoPK;
import Modelo.Mantenedores.ProyectoSector;
import Modelo.Mantenedores.Sector;
import ModuloCap.Entidades.AsigProyectoSector;
import ModuloCap.Entidades.AsigProyectoSectorPK;
import ModuloCap.Entidades.Proyectos;
import ModuloCap.Entidades.Sectores;

/**
 *
 * @author Christian
 */
public class ProyectoSectorMapper implements IProyectoSectorMapper {

    @Override
    public ProyectoSector EntiyToModel(AsigProyectoSector proyectosectorEntity) {
        if (proyectosectorEntity == null) {
            return null;
        }

        Proyecto proyecto = null;
        if (proyectosectorEntity.getProyectoid() != null) {
            proyecto = new Proyecto();
            proyecto.setProyectoid(proyectosectorEntity.getProyectoid().getProyectoid());
            proyecto.setNombre(proyectosectorEntity.getProyectoid().getNombre().toUpperCase());

        }

        Sector sector = null;
        if (proyectosectorEntity.getSectorid() != null) {
            sector = new Sector();
            sector.setSectorid(proyectosectorEntity.getSectorid().getSectorid());
            sector.setNombre(proyectosectorEntity.getSectorid().getNombre().toUpperCase());
        }

        ProyectoPK compuestaPk = null;
        if (proyectosectorEntity.getAsigProyectoPk() != null) {
            compuestaPk = new ProyectoPK();
            compuestaPk.setAsigid(proyectosectorEntity.getAsigProyectoPk().getAsigid());
            compuestaPk.setProyectoid(proyectosectorEntity.getAsigProyectoPk().getProyectoid());
        }
        ProyectoSector ps = new ProyectoSector();
        ps.setCompuestaPk(compuestaPk);
        ps.setProyecto(proyecto);
        ps.setSector(sector);
        return ps;
    }

    @Override
    public AsigProyectoSector ModelToEntity(ProyectoSector proyectosector) {
        if (proyectosector == null) {
            return null;
        }

        Proyectos proyecto = null;
        if (proyectosector.getProyecto() != null) {
            proyecto = new Proyectos();
            proyecto.setProyectoid(proyectosector.getProyecto().getProyectoid());
            proyecto.setNombre(proyectosector.getProyecto().getNombre().toUpperCase());
        }

        Sectores sector = null;
        if (proyectosector.getSector() != null) {
            sector = new Sectores();
            sector.setSectorid(proyectosector.getSector().getSectorid());
            sector.setNombre(proyectosector.getSector().getNombre().toUpperCase());
        }

        AsigProyectoSectorPK compuestaPk = null;
        if (proyectosector.getCompuestaPk() != null) {
            compuestaPk = new AsigProyectoSectorPK();
            compuestaPk.setAsigid(proyectosector.getAsigid());
        }

        AsigProyectoSector aps = new AsigProyectoSector();
        aps.setAsigProyectoPk(compuestaPk);
        aps.setProyectoid(proyecto);
        aps.setSectorid(sector);
        return aps;
    }

}
