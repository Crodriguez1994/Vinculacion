/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.InterfacesDao;

import ModuloCap.Entidades.CabHorarios;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface ICabHorariosDao {

    public CabHorarios getCabhorariosId(int cabhorarioid);

    public void Guardar(CabHorarios cabhorario);

    public void Modificar(CabHorarios cabhorario);

    public void Eliminar(CabHorarios cabhorario);

    public List<CabHorarios> getCabhorarioslist();
}
