/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.InterfacesDao;

import ModuloCap.Entidades.DetaAsistencias;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface IDetaAsistenciasDao {

    public DetaAsistencias getDetasistenciasId(int detasistenciasPk);

    public void Guardar(DetaAsistencias detasistencia);

    public void Modificar(DetaAsistencias detasistencia);

    public void Eliminar(DetaAsistencias detasistencia);

    public List<DetaAsistencias> getDetasistenciaslist();

    public List<DetaAsistencias> getDetasistenciaslist(int cabasistenciaid, int detasistenciaid);
}
