/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.InterfacesDao;

import ModuloCap.Entidades.Proyectos;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface IProyectosDao {

    public Proyectos getProyectosId(int proyectoid);

    public void Guardar(Proyectos proyecto);

    public void Modificar(Proyectos proyecto);

    public void Eliminar(Proyectos proyecto);

    public List<Proyectos> getProyectoslist();
    
     public List<Proyectos> getProyectosById(int proyectoId);
    
    public int getNextId();

}
