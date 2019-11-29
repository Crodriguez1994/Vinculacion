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
public class CoordinadorMapper implements ICoordinadorMapper {

    @Override
    public Coordinador EntiyToModel(Coordinadores coordinadorEntity) {
        if (coordinadorEntity == null) {
            return null;
        }

        Coordinador coordinador = new Coordinador();
        coordinador.setCoordinadorid(coordinadorEntity.getCoordinadorid());
        coordinador.setCedula(coordinadorEntity.getCedula().toUpperCase());
        coordinador.setApellidos(coordinadorEntity.getApellidos().toUpperCase());
        coordinador.setNombres(coordinadorEntity.getNombres().toUpperCase());
        coordinador.setDireccion(coordinadorEntity.getDireccion().toUpperCase());
        coordinador.setCelular(coordinadorEntity.getCelular().toUpperCase());
        coordinador.setConvencional(coordinador.getConvencional().toUpperCase());
        coordinador.setEmail(coordinadorEntity.getEmail().toUpperCase());
        coordinador.setFechaingreso(coordinadorEntity.getFechaingreso());
        coordinador.setEstado(coordinadorEntity.getEstado().equals("A") ? "ACTIVO" : "INACTIVO");
        coordinador.setTipo(coordinadorEntity.getTipo().equals("I") ? "INTERNO" : "EXTERNO");
        return coordinador;
    }

    @Override
    public Coordinadores ModelToEntity(Coordinador coordinador) {
        if (coordinador == null) {
            return null;
        }

        Coordinadores coordinadores = new Coordinadores();
        coordinadores.setCoordinadorid(coordinador.getCoordinadorid());
        coordinadores.setCedula(coordinador.getCedula().toUpperCase());
        coordinadores.setApellidos(coordinador.getApellidos().toUpperCase());
        coordinadores.setNombres(coordinador.getNombres().toUpperCase());
        coordinadores.setDireccion(coordinador.getDireccion().toUpperCase());
        coordinadores.setCelular(coordinador.getCelular().toUpperCase());
        coordinadores.setConvencional(coordinador.getConvencional().toUpperCase());
        coordinadores.setEmail(coordinador.getEmail().toUpperCase());
        coordinadores.setFechaingreso(coordinador.getFechaingreso());
        coordinadores.setEstado(coordinador.getEstado().equals("ACTIVO") ? "A" : "I");
        coordinadores.setTipo(coordinador.getTipo().equals("INTERNO") ? "I" : "E");
        return coordinadores;
    }

}
