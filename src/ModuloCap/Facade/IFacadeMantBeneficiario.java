/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Modelo.Mantenedores.Beneficiario;
import java.util.List;

/**
 *
 * @author antho
 */
public interface IFacadeMantBeneficiario {
    
    public void GuardarBeneficiario (Beneficiario beneficiario);
    
    public void EliminarBeneficiario(Beneficiario beneficiario);
    
    public List<Beneficiario>GettAllBeneficiarios();
    
}
