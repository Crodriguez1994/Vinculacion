/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Modelo.Procesos.Asistencia;
import java.util.List;

/**
 *
 * @author antho
 */
public interface IFacadeProcesoAsistencia {
    
    public void GuardarAsistencia (Asistencia asistencia);
    
    public void EliminarAsistenica(Asistencia asistencia);
    
    public List<Asistencia>GetAllAsistencia();
    
}
