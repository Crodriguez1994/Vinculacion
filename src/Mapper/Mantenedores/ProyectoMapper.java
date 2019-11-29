/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper.Mantenedores;

import Modelo.Mantenedores.Proyecto;
import ModuloCap.Entidades.Proyectos;


/**
 *
 * @author Christian
 */
public class ProyectoMapper implements IProyectoMapper {
    
    @Override
    public Proyecto EntiyToModel(Proyectos proyectoEntity) {
        
        if (proyectoEntity == null) {
            return null;
        }
        
        Proyecto proyecto = new Proyecto();
        proyecto.setProyectoid(proyectoEntity.getProyectoid());
        proyecto.setNombre(proyectoEntity.getNombre().toUpperCase());
        proyecto.setEstado(proyectoEntity.getEstado().equals("A") ? "ACTIVO" : "INACTIVO");
        proyecto.setFecha(proyectoEntity.getFecha());
        proyecto.setSeleccionar(false);
        
        return proyecto;
    }
    
    @Override
    public Proyectos ModelToEntity(Proyecto proyecto) {
        if (proyecto == null) {
            return null;
        }
        
        Proyectos proyectos = new Proyectos();
        proyectos.setProyectoid(proyecto.getProyectoid());
        proyectos.setNombre(proyecto.getNombre().toUpperCase());
        proyectos.setEstado(proyecto.getEstado().equals("ACTIVO") ? "A" : "I");
        proyectos.setFecha(proyecto.getFecha());
        
        return proyectos;
    }
    
}
