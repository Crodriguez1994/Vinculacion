/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Mantenedores;

import Modelo.Mantenedores.DetaHorario;
import Modelo.Mantenedores.Dias;

import Modelo.Mantenedores.Horario;
import ModuloCap.Entidades.Biodias;
import ModuloCap.Entidades.CabHorarios;
import ModuloCap.Entidades.DetaHorarios;

/**
 *
 * @author antho
 */
public class DetaHorarioMapper implements IDetaHorarioMapper{

    @Override
    public DetaHorario EntiyToModel(DetaHorarios detahorarioEntity) {
        if (detahorarioEntity == null) {
            return null;
        }
        Dias dia=null;
        if(detahorarioEntity.getDiaid()!=null){
            dia=new Dias();
            dia.setDiaid(detahorarioEntity.getDiaid().getDiaid());
            dia.setNombre(detahorarioEntity.getDiaid().getNombre());            
        }
        Horario horario=null;
        if(detahorarioEntity.getCabHorid()!=null){
            horario=new Horario();
            horario.setCabhorarioid(detahorarioEntity.getCabHorid().getCabhorarioid());
            horario.setNombre(detahorarioEntity.getCabHorid().getNombre());
        }
        DetaHorario detaHorario=new DetaHorario();
        detaHorario.setDetahorarioid(detahorarioEntity.getDetahorariosPk().getDetahorarioid()); ;
        detaHorario.setDiaid(dia);
        detaHorario.setCabhorarioid(horario);
        detaHorario.setHorainicio(detahorarioEntity.getHorainicio());
        detaHorario.setHorafin(detahorarioEntity.getHorafin());        
        
        return detaHorario;
    }

    @Override
    public DetaHorarios ModelToEntity(DetaHorario detahorario) {
        if(detahorario==null){
            return null;            
        }        
        Biodias biodia=null;
        if(detahorario.getDiaid()!=null){
            biodia=new Biodias();
            biodia.setDiaid(detahorario.getDiaid().getDiaid());
            biodia.setNombre(detahorario.getDiaid().getNombre());            
        }
        CabHorarios cabhorario=null;
        if(detahorario.getCabhorarioid()!=null){
            cabhorario = new CabHorarios();
            cabhorario.setCabhorarioid(detahorario.getCabhorarioid().getCabhorarioid());
            cabhorario.setNombre(detahorario.getCabhorarioid().getNombre());
        }
        DetaHorarios detahorarios=new DetaHorarios();
        detahorarios.getDetahorariosPk().setDetahorarioid(detahorario.getDetahorarioid());
        detahorarios.setDiaid(biodia);
        detahorarios.setCabHorid(cabhorario);
        detahorarios.setHorainicio(detahorario.getHorainicio());
        detahorarios.setHorafin(detahorario.getHorafin());
        return detahorarios;
    }
    
}
