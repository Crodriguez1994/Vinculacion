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
 
 */
public interface IBeneficiarioMapper {
    
    public Beneficiario EntiyToModel (Beneficiarios beneficiarioEntity);
    
    public Beneficiarios ModelToEntity (Beneficiario beneficiario);
    
}
