/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.InterfacesDao;

import ModuloCap.Entidades.Especialidades;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface IEspecialidadesDao {

    public Especialidades getEspecialidadesId(int especialidadid);

    public void Guardar(Especialidades especialidad);

    public void Modificar(Especialidades especialidad);

    public void Eliminar(Especialidades especialidad);

    public List<Especialidades> getEspecialidadeslist();
    
    public int getNextId();
}
