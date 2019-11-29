/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Mapper.Mantenedores.EspecialidadMapper;
import Mapper.Mantenedores.IEspecialidadMapper;
import Modelo.Mantenedores.Especialidad;
import ModuloCap.Dao.EspecialidadesDAO;
import ModuloCap.Entidades.Especialidades;
import ModuloCap.InterfacesDao.IEspecialidadesDao;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class FacadeMantEspecialidades implements IFacadeMantEspecialidad{
    
    private final IEspecialidadesDao especialidadesDao;
    
    private final IEspecialidadMapper especialidadMapper;

    public FacadeMantEspecialidades() {
        especialidadesDao=new EspecialidadesDAO();
        
        especialidadMapper=new EspecialidadMapper();
    }
    
    
    @Override
    public void GuardarEspecialidad(Especialidad especialidad) {
        Especialidades especialidades=especialidadMapper.ModelToEntity(especialidad);
        if(especialidades.getEspecialidadid()==0){
            especialidadesDao.Guardar(especialidades);
        }else{
            especialidadesDao.Modificar(especialidades);
        }        
    }

    @Override
    public void EliminarEspecialidad(Especialidad especialidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Especialidad> GetAllEspecialidades() {
        List<Especialidad>especialidades= new ArrayList<>();
        List<Especialidades> entities=especialidadesDao.getEspecialidadeslist();
        for(Especialidades entity : entities){
            Especialidad especialidad=especialidadMapper.EntityToModel(entity);
            especialidades.add(especialidad);
        }
        return especialidades;        
    }
    
}
