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
public class SectorMapper implements ISectorMapper {

    @Override
    public Sector EntiyToModel(Sectores sectoresEntity) {
        if (sectoresEntity == null) {
            return null;
        }
        Sector sector = new Sector();
        sector.setSectorid(sectoresEntity.getSectorid());
        sector.setNombre(sectoresEntity.getNombre().toUpperCase());
        sector.setEstado(sectoresEntity.getEstado().equals("A") ? "ACTIVO" : "INACTIVO");
        sector.setFecha(sectoresEntity.getFecha());
        sector.setSeleccion(false);

        return sector;
    }

    @Override
    public Sectores ModelToEntity(Sector sector) {
        if (sector == null) {
            return null;
        }
        Sectores sectores = new Sectores();
        sectores.setSectorid(sector.getSectorid());
        sectores.setNombre(sector.getNombre().toUpperCase());
        sectores.setEstado(sector.getEstado().equals("ACTIVO") ? "A" : "I");
        sectores.setFecha(sector.getFecha());

        return sectores;
    }

}
