/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.InterfacesDao;

import ModuloCap.Entidades.UnidadesAtencion;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface IUndAtencionDao {

    public void Guardar(UnidadesAtencion undatencion);

    public void Modificar(UnidadesAtencion undatencion);

    public void Eliminar(UnidadesAtencion undatencion);

    public UnidadesAtencion getUndAtencionId(int undatencionid);

    public List<UnidadesAtencion> getUndAtencionList();

    public List<UnidadesAtencion> getUndAtencionByProyecto(int proyectoId);

    public List<UnidadesAtencion> getUndAtencionBySector(int sectorId);

    public int getNextId();

}
