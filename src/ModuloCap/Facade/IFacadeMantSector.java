/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Modelo.Mantenedores.Sector;
import java.util.List;

/**
 *
 * @author antho
 */
public interface IFacadeMantSector {
    
    public void GuardarSector(Sector sector);

    public void EliminarSector(Sector sector);

    public List<Sector> GetAllSectores();
    
}
