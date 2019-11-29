/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.InterfacesDao;

import ModuloCap.Entidades.DetaInscripciones;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface IDetaInscripcionesDao {
    
     public DetaInscripciones getDetainscripciones(int detainscripcionesPk);

    public void Guardar(DetaInscripciones detainscripcion);

    public void Modificar(DetaInscripciones detainscripcion);

    public void Eliminar(DetaInscripciones detainscripcion);

    public List<DetaInscripciones> getDetainscripcioneslist();

    public List<DetaInscripciones> getDetainscripcioneslist(int cabinscripcionid, int detainscripcionid);

}
