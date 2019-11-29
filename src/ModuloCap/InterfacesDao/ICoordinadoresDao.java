/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.InterfacesDao;

import ModuloCap.Entidades.Coordinadores;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface ICoordinadoresDao {

    public Coordinadores getCoordinadorId(int coordinadorid);

    public void Guardar(Coordinadores coordinador);

    public void Modificar(Coordinadores coordinador);

    public void Eliminar(Coordinadores coordinador);

    public List<Coordinadores> getCoordinadoreslist();
    
    public List<Coordinadores>getCoordinadoresById(int coordinadorId);

    public int getNextId();
}
