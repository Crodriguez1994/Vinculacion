/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.InterfacesDao;

import ModuloCap.Entidades.ModulosCapacitaciones;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface IModuloCapDao {

    public ModulosCapacitaciones getModulocapId(int modulocapPk);

    public void Guardar(ModulosCapacitaciones moduloscap);

    public void Modificar(ModulosCapacitaciones moduloscap);

    public void Eliminar(ModulosCapacitaciones moduloscap);

    public List<ModulosCapacitaciones> getModulocaplist();

    public List<ModulosCapacitaciones> getModulocaplist(int cabcapid, int modulocapid);

    public List<ModulosCapacitaciones> getModuloByCabCap(int cabcapid);
}
