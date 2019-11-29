/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Procesos;

import Modelo.Mantenedores.Beneficiario;
import Modelo.Procesos.Asistencia;
import Modelo.Procesos.DetaAsistencia;
import ModuloCap.Entidades.Beneficiarios;
import ModuloCap.Entidades.CabAsistencias;
import ModuloCap.Entidades.DetaAsistencias;

/**
 * 
 */
public class DetaAsistenciaMapper implements IDetaAsistenciaMapper{

    @Override
    public DetaAsistencia EntityToModel(DetaAsistencias detaEntity) {
        if(detaEntity==null){
            return null;
        }
        Beneficiario beneficiario=null;
        if(detaEntity.getBeneficiarioid()!=null){
            beneficiario=new Beneficiario();
            beneficiario.setBeneficiarioid(detaEntity.getBeneficiarioid().getBeneficiarioid());
            beneficiario.setCedula(detaEntity.getBeneficiarioid().getCedula());
            beneficiario.setApellidos(detaEntity.getBeneficiarioid().getApellidos());
            beneficiario.setNombres(detaEntity.getBeneficiarioid().getNombres());
        }
        Asistencia asistencia=null;
        if(detaEntity.getCabAsis()!=null){
            asistencia=new Asistencia();
            asistencia.setCabasistenciaid(detaEntity.getCabAsis().getCabasistenciaid());            
        }
        DetaAsistencia detaasistencia=new DetaAsistencia();
        detaasistencia.setDetasistenciaid(detaEntity.getDetasistenciasPk().getDetasistenciaid());
        detaasistencia.setCabasistenciaid(asistencia);
        detaasistencia.setBeneficiarioid(beneficiario);
        detaasistencia.setAsistencia(false);
        return detaasistencia;
    }

    @Override
    public DetaAsistencias ModelToEntity(DetaAsistencia detaasistencia) {
        if(detaasistencia==null){
            return null;
        }
        Beneficiarios beneficiarios=null;
        if(detaasistencia.getBeneficiarioid()!=null){
            beneficiarios=new Beneficiarios(); 
            beneficiarios.setBeneficiarioid(detaasistencia.getBeneficiarioid().getBeneficiarioid());
            beneficiarios.setCedula(detaasistencia.getBeneficiarioid().getCedula());
            beneficiarios.setApellidos(detaasistencia.getBeneficiarioid().getApellidos());
            beneficiarios.setNombres(detaasistencia.getBeneficiarioid().getNombres());
        }
        CabAsistencias asistencias= null;
        if(detaasistencia.getCabasistenciaid()!=null){
            asistencias=new CabAsistencias();
            asistencias.setCabasistenciaid(detaasistencia.getCabasistenciaid().getCabasistenciaid());
        }
        DetaAsistencias detaasistencias=new DetaAsistencias();
        detaasistencias.getDetasistenciasPk().setDetasistenciaid(detaasistencia.getDetasistenciaid());
        detaasistencias.setBeneficiarioid(beneficiarios);
        detaasistencias.setCabAsis(asistencias);
        detaasistencias.setAsistencia(false);
        return detaasistencias;
    }
    
}
