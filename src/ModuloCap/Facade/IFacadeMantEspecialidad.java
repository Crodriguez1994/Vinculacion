/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Modelo.Mantenedores.Especialidad;
import java.util.List;

/**
 *
 * @author antho
 */
public interface IFacadeMantEspecialidad {
    
    public void GuardarEspecialidad(Especialidad especialidad);

    public void EliminarEspecialidad(Especialidad especialidad);

    public List<Especialidad> GetAllEspecialidades();
    
}
