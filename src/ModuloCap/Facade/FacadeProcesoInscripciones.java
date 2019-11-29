/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Mapper.Mantenedores.BeneficiarioMapper;
import Mapper.Mantenedores.HorarioMapper;
import Mapper.Mantenedores.IBeneficiarioMapper;
import Mapper.Mantenedores.IHorarioMapper;
import Mapper.Procesos.CapacitacionMapper;
import Mapper.Procesos.DetaInscripcionMapper;
import Mapper.Procesos.ICapacitacionMapper;
import Mapper.Procesos.IDetaInscripcionMapper;
import Mapper.Procesos.IInscripcionMapper;
import Mapper.Procesos.InscripcionMapper;
import Modelo.Procesos.Inscripcion;
import ModuloCap.Dao.BeneficiariosDAO;
import ModuloCap.Dao.CabCapacitacionesDAO;
import ModuloCap.Dao.CabHorariosDAO;
import ModuloCap.Dao.CabInscripcionesDAO;
import ModuloCap.Dao.DetaInscripcionesDAO;
import ModuloCap.Entidades.CabInscripciones;
import ModuloCap.InterfacesDao.IBeneficiariosDao;
import ModuloCap.InterfacesDao.ICabCapacitacionesDao;
import ModuloCap.InterfacesDao.ICabHorariosDao;
import ModuloCap.InterfacesDao.ICabInscripcionesDao;
import ModuloCap.InterfacesDao.IDetaInscripcionesDao;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class FacadeProcesoInscripciones implements IFacadeProcesoInscripciones{

    private final ICabCapacitacionesDao capDao;
    private final ICabHorariosDao horDao;
    private final IBeneficiariosDao benDao;
    private final ICabInscripcionesDao cabinscDao;
    private final IDetaInscripcionesDao detainscDao;
    
    
    private final IHorarioMapper horMapper;
    private final ICapacitacionMapper capMapper;    
    private final IBeneficiarioMapper benMapper;
    private final IInscripcionMapper inscMapper;
    private final IDetaInscripcionMapper detainsMapper;
    
    
    
    public FacadeProcesoInscripciones() {
        cabinscDao = new CabInscripcionesDAO();
        detainscDao=new DetaInscripcionesDAO();
        capDao = new CabCapacitacionesDAO();
        horDao = new CabHorariosDAO();
        benDao=new BeneficiariosDAO();
        
        capMapper=new CapacitacionMapper();
        horMapper=new HorarioMapper();
        benMapper=new BeneficiarioMapper();
        inscMapper = new InscripcionMapper();
        detainsMapper = new DetaInscripcionMapper();
    }
    
    
    

    @Override
    public void GuardarInscripcion(Inscripcion inscripcion) {
        CabInscripciones inscrip=inscMapper.ModelToEntity(inscripcion);
        cabinscDao.Guardar(inscrip);
    }

    @Override
    public void EliminarInscripcion(Inscripcion inscripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Inscripcion> GetAllInscripcion() {
        List<Inscripcion> inscripciones=new ArrayList<>();
        List<CabInscripciones>entities=cabinscDao.getCabinscripcioneslist();
        for(CabInscripciones entity : entities){
            Inscripcion inscripcion = inscMapper.EntityToModel(entity);
            inscripciones.add(inscripcion);
        }                
        return inscripciones;
    }

    @Override
    public List<Inscripcion> GetInscripcionByBeneficiario(int beneficiarioid) {
        List<Inscripcion> inscripcion=new ArrayList();
        return inscripcion;      
    }
    
}
