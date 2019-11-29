/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Mantenedores;

import Modelo.Mantenedores.Beneficiario;
import ModuloCap.Entidades.Beneficiarios;

/**
 *
 * @author antho
 */
public class BeneficiarioMapper implements IBeneficiarioMapper{

    @Override
    public Beneficiario EntiyToModel(Beneficiarios beneficiarioEntity) {
        if (beneficiarioEntity == null) {
            return null;
        }
        Beneficiario beneficiario = new Beneficiario();
        beneficiario.setBeneficiarioid(beneficiarioEntity.getBeneficiarioid());
        beneficiario.setApellidos(beneficiarioEntity.getApellidos().toUpperCase());
        beneficiario.setCedula(beneficiarioEntity.getCedula().toUpperCase());
        beneficiario.setEmail(beneficiarioEntity.getEmail().toUpperCase());
        beneficiario.setDireccion(beneficiarioEntity.getDireccion().toUpperCase());
        beneficiario.setEstado(beneficiarioEntity.getEstado().equals("A") ? "ACTIVO" : "INACTIVO");
        beneficiario.setFecha(beneficiarioEntity.getFecha());
        beneficiario.setNombres(beneficiarioEntity.getNombres().toUpperCase());
        beneficiario.setCelular(beneficiarioEntity.getCelular().toUpperCase());
        beneficiario.setConvencional(beneficiarioEntity.getConvencional().toUpperCase());
        beneficiario.setSeleccionar(false);
        
        return beneficiario;
    }

    @Override
    public Beneficiarios ModelToEntity(Beneficiario beneficiario) {
        if (beneficiario == null) {
            return null;
        }
        Beneficiarios beneficiarios =new Beneficiarios();
        beneficiarios.setBeneficiarioid(beneficiario.getBeneficiarioid());
        beneficiarios.setApellidos(beneficiario.getApellidos().toUpperCase());
        beneficiarios.setCedula(beneficiario.getCedula().toUpperCase());
        beneficiarios.setEmail(beneficiario.getEmail().toUpperCase());
        beneficiarios.setDireccion(beneficiario.getDireccion().toUpperCase());
        beneficiarios.setEstado(beneficiario.getEstado().equals("ACTIVO") ? "A" : "I");
        beneficiarios.setFecha(beneficiario.getFecha());
        beneficiarios.setNombres(beneficiario.getNombres().toUpperCase());
        beneficiarios.setCelular(beneficiario.getCelular().toUpperCase());
        beneficiarios.setConvencional(beneficiario.getConvencional().toUpperCase());
        return beneficiarios;
    }
    
}
