/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.InterfacesDao;

import ModuloCap.Entidades.CabInscripciones;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface ICabInscripcionesDao {

    public CabInscripciones getCabinscripciones(int cabinscripcionid);

    public void Guardar(CabInscripciones cabinscripcion);

    public void Modificar(CabInscripciones cabinscripcion);

    public void Eliminar(CabInscripciones cabinscripcion);

    public List<CabInscripciones> getCabinscripcioneslist();
}
