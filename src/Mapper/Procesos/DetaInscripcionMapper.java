/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Procesos;

import Modelo.Mantenedores.Beneficiario;
import Modelo.Procesos.DetaInscripcion;
import Modelo.Procesos.Inscripcion;
import ModuloCap.Entidades.Beneficiarios;
import ModuloCap.Entidades.CabInscripciones;
import ModuloCap.Entidades.DetaInscripciones;

/**
 * 
 */
public class DetaInscripcionMapper implements IDetaInscripcionMapper{

    @Override
    public DetaInscripcion EntityToModel(DetaInscripciones detainscripcionEntity) {
        if(detainscripcionEntity==null){
            return null;
        }
        Beneficiario beneficiario =null;
        if(detainscripcionEntity.getBeneficiarioid()!=null){
            beneficiario = new Beneficiario();
            beneficiario.setBeneficiarioid(detainscripcionEntity.getBeneficiarioid().getBeneficiarioid());
            beneficiario.setCedula(detainscripcionEntity.getBeneficiarioid().getCedula());
            beneficiario.setApellidos(detainscripcionEntity.getBeneficiarioid().getApellidos());
            beneficiario.setNombres(detainscripcionEntity.getBeneficiarioid().getNombres());
            //beneficiario.setEstado(detainscripcionEntity.getBeneficiarioid().getEstado());
            beneficiario.setSeleccionar(false);
        }
        Inscripcion inscripcion = null;
        if(detainscripcionEntity.getCabInscr()!=null){
            inscripcion=new Inscripcion();
            inscripcion.setCabinscripcionid(detainscripcionEntity.getCabInscr().getCabinscripcionid());            
        }
        DetaInscripcion detainscripcion=new DetaInscripcion();
        detainscripcion.setDetainsid(detainscripcionEntity.getDetainscripcionesPk().getDetainsid());
        detainscripcion.setBeneficiarioid(beneficiario);
        detainscripcion.setCabInscr(inscripcion);
        return detainscripcion;         
    }

    @Override
    public DetaInscripciones ModelToEntity(DetaInscripcion detainscripcion) {
        if(detainscripcion==null){
            return null;
        }
        Beneficiarios beneficiarios=null;
        if(detainscripcion.getBeneficiarioid()!=null){
            beneficiarios= new Beneficiarios();
            beneficiarios.setBeneficiarioid(detainscripcion.getBeneficiarioid().getBeneficiarioid());
            beneficiarios.setCedula(detainscripcion.getBeneficiarioid().getCedula());
            beneficiarios.setApellidos(detainscripcion.getBeneficiarioid().getApellidos());
            beneficiarios.setNombres(detainscripcion.getBeneficiarioid().getNombres());
        }
        CabInscripciones inscripciones=null;
        if(detainscripcion.getCabInscr()!=null){
           inscripciones=new CabInscripciones();
           inscripciones.setCabinscripcionid(detainscripcion.getCabInscr().getCabinscripcionid());
        }
        DetaInscripciones detainscrcipciones=new DetaInscripciones();
        detainscrcipciones.getDetainscripcionesPk().setDetainsid(detainscripcion.getDetainsid());
        detainscrcipciones.setBeneficiarioid(beneficiarios);
        detainscrcipciones.setCabInscr(inscripciones);
        return detainscrcipciones;
    }
    
}
