/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Mapper.Mantenedores.DetaHorarioMapper;
import Mapper.Mantenedores.HorarioMapper;
import Mapper.Mantenedores.IDetaHorarioMapper;
import Mapper.Mantenedores.IHorarioMapper;
import Modelo.Mantenedores.Horario;
import ModuloCap.Dao.CabHorariosDAO;
import ModuloCap.Dao.DetaHorariosDAO;
import ModuloCap.Entidades.CabHorarios;
import ModuloCap.InterfacesDao.ICabHorariosDao;
import ModuloCap.InterfacesDao.IDetaHorariosDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antho
 */
public class FacadeMantHorario implements IFacadeMantHorarios{

    private final ICabHorariosDao horarioDao;    
    private final IDetaHorariosDao detahorarioDao; 
    
    private final IHorarioMapper horarioMapper;
    private final IDetaHorarioMapper detahorarioMapper;
    
    
    public FacadeMantHorario() {
        horarioDao =new CabHorariosDAO();
        detahorarioDao =new DetaHorariosDAO();
        horarioMapper =new HorarioMapper();
        detahorarioMapper =new DetaHorarioMapper();
    }        
    @Override
    public void GuardarHorario(Horario horario) {
        CabHorarios horar=horarioMapper.ModelToEntity(horario);
        horarioDao.Guardar(horar);
    }

    @Override
    public void EliminarProyecto(Horario horario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Horario> GetAllHorario() {
        List<Horario> horarios=new ArrayList<>();
        List<CabHorarios> entities=horarioDao.getCabhorarioslist();
        for(CabHorarios entity : entities){
            Horario horario=horarioMapper.EntiyToModel(entity);
            horarios.add(horario);
        }
        return horarios;                                
    }
    
}
