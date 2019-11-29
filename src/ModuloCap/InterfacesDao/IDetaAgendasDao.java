/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.InterfacesDao;

import ModuloCap.Entidades.DetaAgendas;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface IDetaAgendasDao {

    public DetaAgendas getDetAgendasId(int detagendapk);

    public void Guardar(DetaAgendas detagenda);

    public void Modificar(DetaAgendas detagenda);

    public void Eliminar(DetaAgendas detagenda);

    public List<DetaAgendas> getDetAgendaslist();
    
    public List<DetaAgendas> getDetAgendaslist(int cabagendaid);
    
}
