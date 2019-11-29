/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.InterfacesDao;

import ModuloCap.Entidades.CabCapacitaciones;
import ModuloCap.Entidades.DetaCapacitaciones;
import ModuloCap.Entidades.DetaCapacitacionesPK;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface IDetaCapacitacionesDao {

    public DetaCapacitacionesPK getCapCapacitacionesId();

    public void Guardar(DetaCapacitaciones detacapacitacion);

    public void modificar(DetaCapacitaciones detacapacitacion);

    public void Eliminar(DetaCapacitaciones detacapacitacion);

    public List<DetaCapacitaciones> getDetacapacitacioneslist();

    public List<DetaCapacitaciones> getDetacapacitacioneslist(DetaCapacitacionesPK detacapacitacionesPk);
    
}
