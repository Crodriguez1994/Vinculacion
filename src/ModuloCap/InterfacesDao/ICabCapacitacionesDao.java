/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.InterfacesDao;

import ModuloCap.Entidades.CabCapacitaciones;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface ICabCapacitacionesDao {

    public CabCapacitaciones getcabcapactacionId(int cabcapacitacionid);

    public void Guardar(CabCapacitaciones cabcapacitacion);

    public void Modificar(CabCapacitaciones cabcapacitacion);

    public void Eliminar(CabCapacitaciones cabcapacitacion);

    public List<CabCapacitaciones> getCabcapacitacioneslist();
}
