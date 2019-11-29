/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.InterfacesDao;

import ModuloCap.Entidades.CabAgendas;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface ICabAgendasDao {

    public CabAgendas getCabagendasId(int cabagendaid);

    public void Guardar(CabAgendas cabagenda);

    public void Modificar(CabAgendas cabagenda);

    public void Eliminar(CabAgendas cabagenda);

    public List<CabAgendas> getCabagendaslist();
    
}
