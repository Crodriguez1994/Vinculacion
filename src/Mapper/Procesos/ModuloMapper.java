/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Procesos;

import Modelo.Procesos.Modulo;
import Modelo.Procesos.ModuloPK;
import ModuloCap.Entidades.ModulosCapacitaciones;
import ModuloCap.Entidades.ModulosCapacitacionesPK;

/**
 *
 * @author Christian
 */
public class ModuloMapper implements IModuloMapper {

    @Override
    public Modulo EntityToModel(ModulosCapacitaciones moduloEntity) {
        if (moduloEntity == null) {
            return null;
        }

        ModuloPK compuestaPk = null;
        if (moduloEntity.getModulocap() != null) {
            compuestaPk = new ModuloPK();
            compuestaPk.setCabcapid(moduloEntity.getModulocap().getCabcapid());
            compuestaPk.setModuloid(moduloEntity.getModulocap().getModuloid());
        }
        Modulo modulo = new Modulo();
        modulo.setModuloid(moduloEntity.getModulocap().getModuloid());
        modulo.setCompuestaPk(compuestaPk);
        modulo.setNombre(moduloEntity.getNombre().toUpperCase());
        modulo.setFecha(moduloEntity.getFecha());
        modulo.setEstado(moduloEntity.getEstado().equals("A") ? "ACTIVO" : "INACTIVO");

        return modulo;

    }

    @Override
    public ModulosCapacitaciones ModelToEntity(Modulo modulo) {
        if (modulo == null) {
            return null;
        }

        ModulosCapacitacionesPK compuestaPk = null;
        if (modulo.getCompuestaPk() != null) {
            compuestaPk = new ModulosCapacitacionesPK();
            compuestaPk.setModuloid(modulo.getModuloid());
        }

        ModulosCapacitaciones moduloCap = new ModulosCapacitaciones();
        moduloCap.setModulocap(compuestaPk);
        moduloCap.setNombre(modulo.getNombre());
        moduloCap.setFecha(modulo.getFecha());
        moduloCap.setEstado(modulo.getEstado().equals("ACTIVO") ? "A" : "I");

        return moduloCap;
    }

}
