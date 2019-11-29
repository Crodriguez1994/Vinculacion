/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Modelo.Mantenedores.Horario;
import java.util.List;

/**
 *
 * @author antho
 */
public interface IFacadeMantHorarios {

    
    public void GuardarHorario(Horario horario);

    public void EliminarProyecto(Horario horario);

    public List<Horario> GetAllHorario();        

}
