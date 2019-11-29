/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Modelo.Procesos.Inscripcion;
import java.util.List;

/**
 *
 * @author antho
 */
public interface IFacadeProcesoInscripciones {
    
    public void GuardarInscripcion(Inscripcion inscripcion);
    
    public void EliminarInscripcion (Inscripcion inscripcion);
    
    public List<Inscripcion> GetAllInscripcion();
    
    public List<Inscripcion> GetInscripcionByBeneficiario (int beneficiarioid);

    
    
}
