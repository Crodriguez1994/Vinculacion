/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Procesos;

import Modelo.Mantenedores.Horario;
import Modelo.Procesos.Capacitacion;
import Modelo.Procesos.Inscripcion;
import ModuloCap.Entidades.CabCapacitaciones;
import ModuloCap.Entidades.CabHorarios;
import ModuloCap.Entidades.CabInscripciones;
import java.sql.Date;

/**
 *
 * @author antho
 */
public class InscripcionMapper implements IInscripcionMapper{

    @Override
    public Inscripcion EntityToModel(CabInscripciones inscripcionEntity) {
        if(inscripcionEntity==null){
            return null;
        }
        Capacitacion cabcapacitacion=null;
        if(inscripcionEntity.getCabcapid()!=null){
            cabcapacitacion=new Capacitacion();
            cabcapacitacion.setCabcapid(inscripcionEntity.getCabcapid().getCabcapid());
            cabcapacitacion.setNombre(inscripcionEntity.getCabcapid().getNombre());            
        }
        Horario horario =null;
        if(inscripcionEntity.getCabhorarioid()!=null){
            horario=new Horario();
            horario.setCabhorarioid(inscripcionEntity.getCabhorarioid().getCabhorarioid());
            horario.setNombre(inscripcionEntity.getCabhorarioid().getNombre());
        }
        
        Inscripcion inscripcion = new Inscripcion();        
        inscripcion.setCabinscripcionid(inscripcionEntity.getCabinscripcionid());
        inscripcion.setEstado(inscripcionEntity.getEstado().equals("A") ? "Activo" : "Inactivo");
        inscripcion.setFecha(inscripcionEntity.getFecha());
        inscripcion.setResponsable(inscripcionEntity.getResponsable());
        inscripcion.setCabcapid(cabcapacitacion);
        inscripcion.setCabhorarioid(horario);
        return inscripcion;
    }

    @Override
    public CabInscripciones ModelToEntity(Inscripcion inscripcion) {
        if(inscripcion==null){
            return null;
        }
        CabCapacitaciones cabcapacitacion=null;
        if(inscripcion.getCabcapid()!=null){
            cabcapacitacion=new CabCapacitaciones();
            cabcapacitacion.setCabcapid(inscripcion.getCabcapid().getCabcapid());
            cabcapacitacion.setNombre(inscripcion.getCabcapid().getNombre());
        }
        CabHorarios cabhorarios=null;
        if(inscripcion.getCabhorarioid()!=null){
            cabhorarios=new CabHorarios();
            cabhorarios.setCabhorarioid(inscripcion.getCabhorarioid().getCabhorarioid());
            cabhorarios.setNombre(inscripcion.getCabhorarioid().getNombre());
        }
        CabInscripciones cabinscripciones=new CabInscripciones();
        cabinscripciones.setCabinscripcionid(inscripcion.getCabinscripcionid());
        cabinscripciones.setEstado(inscripcion.getEstado().equals("Activo") ? "A" : "I");
        cabinscripciones.setFecha(inscripcion.getFecha());
        cabinscripciones.setResponsable(inscripcion.getResponsable());
        cabinscripciones.setCabcapid(cabcapacitacion);
        cabinscripciones.setCabhorariid(cabhorarios);
                
        return cabinscripciones;
    }
    
}
