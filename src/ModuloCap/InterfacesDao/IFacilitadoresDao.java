/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.InterfacesDao;

import ModuloCap.Entidades.Facilitadores;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface IFacilitadoresDao {

    public Facilitadores getFacilitadoresId(int facilitadorid);

    public void Guardar(Facilitadores facilitador);

    public void Modificar(Facilitadores facilitador);

    public void Eliminar(Facilitadores facilitador);

    public List<Facilitadores> getFacilitadoreslist();
    
    public int getNextId();
}
