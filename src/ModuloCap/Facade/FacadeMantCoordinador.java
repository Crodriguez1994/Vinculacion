/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Mapper.Mantenedores.CoordinadorMapper;
import Mapper.Mantenedores.ICoordinadorMapper;
import Modelo.Mantenedores.Coordinador;
import ModuloCap.Dao.CoordinadoresDAO;
import ModuloCap.Entidades.Coordinadores;
import ModuloCap.InterfacesDao.ICoordinadoresDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antho
 */
public class FacadeMantCoordinador implements IFacadeMantCoordianador{

    
    private final ICoordinadoresDao coordinadorDao;
    
    private final ICoordinadorMapper coordinadorMapper;
    
    public FacadeMantCoordinador() {
        coordinadorDao=new CoordinadoresDAO();
        
        coordinadorMapper=new CoordinadorMapper();
    }
    
    

    @Override
    public void GuardarCoordinador(Coordinador coordinador) {
        Coordinadores coordinadores = coordinadorMapper.ModelToEntity(coordinador);
        if(coordinadores.getCoordinadorid()==0){
            coordinadorDao.Guardar(coordinadores);
        }else{
            coordinadorDao.Modificar(coordinadores);
        }         
    }

    @Override
    public void EliminarCoordinador(Coordinador coordinador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Coordinador> GetAllCoordinador() {
        List<Coordinador> coordinadores=new ArrayList<>();
        List<Coordinadores> entities=coordinadorDao.getCoordinadoreslist();
        for(Coordinadores entity: entities){
            Coordinador coordinador=coordinadorMapper.EntiyToModel(entity);
            coordinadores.add(coordinador);
        }
        return coordinadores;                
    }
    
}
