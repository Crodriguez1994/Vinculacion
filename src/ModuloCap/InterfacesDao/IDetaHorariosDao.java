/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.InterfacesDao;

import ModuloCap.Entidades.DetaHorarios;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface IDetaHorariosDao {

    public DetaHorarios getDetahorarios(int detahorariosPk);

    public void Guardar(DetaHorarios detahorario);

    public void Modificar(DetaHorarios detahorario);

    public void Eliminar(DetaHorarios detahorario);

    public List<DetaHorarios> getDetahorarioslist();

    public List<DetaHorarios> getDetahorarioslist(int cabhorariosid, int detahorarioid);

}
