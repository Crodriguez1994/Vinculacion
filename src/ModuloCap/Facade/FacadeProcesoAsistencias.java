/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Mapper.Mantenedores.BeneficiarioMapper;
import Mapper.Mantenedores.IBeneficiarioMapper;
import Mapper.Procesos.AsistenciaMapper;
import Mapper.Procesos.DetaAsistenciaMapper;
import Mapper.Procesos.IAsistenciaMapper;
import Mapper.Procesos.IDetaAsistenciaMapper;
import Mapper.Procesos.IInscripcionMapper;
import Mapper.Procesos.InscripcionMapper;
import Modelo.Procesos.Asistencia;
import ModuloCap.Dao.BeneficiariosDAO;
import ModuloCap.Dao.CabAsistenciasDAO;
import ModuloCap.Dao.CabInscripcionesDAO;
import ModuloCap.Dao.DetaAsistenciasDAO;
import ModuloCap.Entidades.CabAsistencias;
import ModuloCap.InterfacesDao.IBeneficiariosDao;
import ModuloCap.InterfacesDao.ICabAsistenciasDao;
import ModuloCap.InterfacesDao.ICabInscripcionesDao;
import ModuloCap.InterfacesDao.IDetaAsistenciasDao;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class FacadeProcesoAsistencias implements IFacadeProcesoAsistencia{

    private final ICabInscripcionesDao inscDao;
    private final ICabAsistenciasDao asistenciaDao;
    private final IDetaAsistenciasDao detasistenDao;
    private final IBeneficiariosDao beneDao;
    
    
    
    private final IInscripcionMapper inscMapper;
    private final IAsistenciaMapper asisMapper;
    private final IDetaAsistenciaMapper detasisMapper;
    private final IBeneficiarioMapper benefMapper;
    
    
    
    
    public FacadeProcesoAsistencias() {
        inscDao=new CabInscripcionesDAO();
        asistenciaDao =new CabAsistenciasDAO();
        detasistenDao=new DetaAsistenciasDAO();
        beneDao= new BeneficiariosDAO(); 
        
        inscMapper=new InscripcionMapper();
        asisMapper =new AsistenciaMapper();
        detasisMapper =new DetaAsistenciaMapper();
        benefMapper =new BeneficiarioMapper();
    }

    @Override
    public void GuardarAsistencia(Asistencia asistencia) {
        CabAsistencias asiste=asisMapper.ModelToEntity(asistencia);
        asistenciaDao.Guadar(asiste);
    }

    @Override
    public void EliminarAsistenica(Asistencia asistencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Asistencia> GetAllAsistencia() {
        List<Asistencia> asistencias=new ArrayList<>();
        List<CabAsistencias> entities=asistenciaDao.getCabasistenciaslist();
        for(CabAsistencias entity:entities){
            Asistencia asistencia=asisMapper.EntityToModel(entity);
            asistencias.add(asistencia);
        }
        return asistencias;                
    }
    
}
