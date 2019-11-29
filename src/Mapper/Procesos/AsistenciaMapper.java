/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Procesos;

import Modelo.Procesos.Asistencia;
import Modelo.Procesos.Inscripcion;
import ModuloCap.Entidades.CabAsistencias;
import ModuloCap.Entidades.CabInscripciones;
import java.sql.Date;

/**
 *
 * @author antho
 */
public class AsistenciaMapper implements IAsistenciaMapper{

    @Override
    public Asistencia EntityToModel(CabAsistencias asistenciaEntity) {
        if(asistenciaEntity==null){
            return null;
        }
        Inscripcion inscripcion=null;
        if(asistenciaEntity.getCabinscripcionid()!=null){
             inscripcion=new Inscripcion();       
             inscripcion.setCabinscripcionid(asistenciaEntity.getCabinscripcionid().getCabinscripcionid());
        }
        Asistencia asistencia=new Asistencia();
        asistencia.setCabasistenciaid(asistenciaEntity.getCabasistenciaid());
        asistencia.setEstado(asistenciaEntity.getEstado().equals("A") ? "Activo" : "Inactivo");
        asistencia.setFecha(asistenciaEntity.getFecha());
        asistencia.setCabinscripcionid(inscripcion);
        return asistencia;
    }

    @Override
    public CabAsistencias ModelToEntity(Asistencia asistencia) {
        if(asistencia==null){
            return null;
        }
        CabInscripciones inscripcion=null;
        if(asistencia.getCabinscripcionid()!=null){
            inscripcion=new CabInscripciones();
            inscripcion.setCabinscripcionid(asistencia.getCabinscripcionid().getCabinscripcionid());
        }
        CabAsistencias asistencias=new CabAsistencias();
        asistencias.setCabasistenciaid(asistencia.getCabasistenciaid());
        asistencias.setEstado(asistencia.getEstado().equals("Activo") ? "A" : "I");
        asistencias.setFecha(asistencia.getFecha());
        asistencias.setCabinscripcionid(inscripcion);
        
        return asistencias;
    }
    
}
