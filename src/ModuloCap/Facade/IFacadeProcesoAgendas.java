/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Modelo.Procesos.Agenda;
import Modelo.Procesos.Capacitacion;
import Modelo.Procesos.DetaAgenda;
import Modelo.Procesos.Modulo;
import java.util.List;

/**
 *
 */
public interface IFacadeProcesoAgendas {

    public void GuardarAgenda(Agenda agenda);

    public void EliminarAgenda(Agenda agenda);

    public List<Agenda> GetAllAgendas();

    public List<Capacitacion> GetAllCapacitaciones();
    
    public List<Modulo> GetModulosByCapapacitacion(int CapacitacionId);
    
    public List<DetaAgenda> GetDetaAgendaByCabecera(int cabeceraId);

}
