/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Mantenedores;

import Modelo.Mantenedores.Horario;
import ModuloCap.Entidades.CabHorarios;
import java.sql.Date;

/**
 * 
 */
public class HorarioMapper implements IHorarioMapper{

    @Override
    public Horario EntiyToModel(CabHorarios horarioEntity) {
        if (horarioEntity == null) {
            return null;
        }
        Horario horario=new Horario();
        horario.setCabhorarioid(horarioEntity.getCabhorarioid());
        horario.setFecha(horarioEntity.getFecha());
        horario.setEstado(horarioEntity.getEstado().equals("A") ? "Activo" : "Inactivo");
        horario.setNombre(horarioEntity.getNombre());
        
        return horario;
    }

    @Override
    public CabHorarios ModelToEntity(Horario horario) {
         if (horario == null) {
            return null;
        }
        CabHorarios Cabhorarios=new CabHorarios();
        Cabhorarios.setCabhorarioid(horario.getCabhorarioid());
        Cabhorarios.setFecha((Date) horario.getFecha());
        Cabhorarios.setNombre(horario.getNombre());
        Cabhorarios.setEstado(horario.getEstado().equals("Activo") ? "A" : "I");
        
        return Cabhorarios;
        
    }
    
}
