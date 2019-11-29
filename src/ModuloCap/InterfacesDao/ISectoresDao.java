/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.InterfacesDao;

import ModuloCap.Entidades.Sectores;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface ISectoresDao {

    public void Guardar(Sectores sector);

    public void Modificar(Sectores sector);

    public void Eliminar(Sectores sector);

    public Sectores getSectoresId(int sectorid);

    public List<Sectores> getSectoreslist();

    public List<Sectores> getSectoresById(int sectorId);

    public int getNextId();
}
