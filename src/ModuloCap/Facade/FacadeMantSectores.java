/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Mapper.Mantenedores.ISectorMapper;
import Mapper.Mantenedores.SectorMapper;
import Modelo.Mantenedores.Sector;
import ModuloCap.Dao.SectoresDAO;
import ModuloCap.Entidades.Sectores;
import ModuloCap.InterfacesDao.ISectoresDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antho
 */
public class FacadeMantSectores implements IFacadeMantSector{

    private final ISectoresDao sectorDao;
    
    private final ISectorMapper sectorMapper;

    public FacadeMantSectores() {
        sectorDao = new SectoresDAO();
        
        sectorMapper= new SectorMapper();
    }

    
    @Override
    public void GuardarSector(Sector sector) {
        Sectores sectores= sectorMapper.ModelToEntity(sector);
        if (sectores.getSectorid() == 0) {
            sectorDao.Guardar(sectores);
        } else {
            sectorDao.Modificar(sectores);
        }
    }

    @Override
    public void EliminarSector(Sector sector) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Sector> GetAllSectores() {
        List<Sector> sectores = new ArrayList<>();
        List<Sectores> entities = sectorDao.getSectoreslist();
        for (Sectores entity : entities) {
            Sector sector = sectorMapper.EntiyToModel(entity);
            sectores.add(sector);
        }
        return sectores;
    }
    
}
