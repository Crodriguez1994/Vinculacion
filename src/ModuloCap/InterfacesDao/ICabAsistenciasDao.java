/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.InterfacesDao;

import ModuloCap.Entidades.CabAsistencias;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface ICabAsistenciasDao {

    public CabAsistencias getCabasistenciaId(int cabeasistenciaid);

    public void Guadar(CabAsistencias cabasistencia);

    public void Modificar(CabAsistencias cabasistencia);

    public void Eliminar(CabAsistencias cabasistencia);

    public List<CabAsistencias> getCabasistenciaslist();
}
