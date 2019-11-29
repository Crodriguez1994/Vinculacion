/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Modelo.Mantenedores.Especialidad;
import Modelo.Mantenedores.Facilitador;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface IFacadeMantFacilitadores {

    public void Guardar(Facilitador facilitador);

    public void Eliminar(Facilitador facilitador);

    public List<Facilitador> GetAllFacilitadores();
    
    public List<Especialidad> GetAllEspecialidades();
}
