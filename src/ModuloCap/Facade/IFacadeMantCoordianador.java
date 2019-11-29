/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Modelo.Mantenedores.Coordinador;
import java.util.List;

/**
 *
 * @author antho
 */
public interface IFacadeMantCoordianador {
    
    public void GuardarCoordinador (Coordinador coordinador);
    
    public void EliminarCoordinador (Coordinador coordinador);
    
    public List<Coordinador> GetAllCoordinador();
    
}
