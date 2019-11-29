/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Mapper.Mantenedores.EspecialidadMapper;
import Mapper.Mantenedores.FacilitadorMapper;
import Mapper.Mantenedores.IEspecialidadMapper;
import Mapper.Mantenedores.IFacilitadorMapper;
import Modelo.Mantenedores.Especialidad;
import Modelo.Mantenedores.Facilitador;
import ModuloCap.Dao.EspecialidadesDAO;
import ModuloCap.Dao.FacilitadoresDAO;
import ModuloCap.Entidades.Especialidades;
import ModuloCap.Entidades.Facilitadores;
import ModuloCap.InterfacesDao.IEspecialidadesDao;
import ModuloCap.InterfacesDao.IFacilitadoresDao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Christian
 */
public class FacadeMantFacilitadores implements IFacadeMantFacilitadores {

    //DAO
    private final IFacilitadoresDao facilitadorDao;
    private final IEspecialidadesDao especialidadDao;
    //DTO
    private final IFacilitadorMapper facilitadorMapper;
    private final IEspecialidadMapper especialidadMapper;
    
    public FacadeMantFacilitadores() {
        //DAO
        facilitadorDao = new FacilitadoresDAO();
        especialidadDao = new EspecialidadesDAO();
        //DTO
        facilitadorMapper = new FacilitadorMapper();
        especialidadMapper = new EspecialidadMapper();
    }

    @Override
    public List<Facilitador> GetAllFacilitadores() {
        List<Facilitador> facilitadores = new ArrayList<>();
        List<Facilitadores> entities = facilitadorDao.getFacilitadoreslist();
        for (Facilitadores entity : entities) {
            Facilitador facilitador = facilitadorMapper.EntiyToModel(entity);
            facilitadores.add(facilitador);
        }
        return facilitadores;
    }

    @Override
    public void Guardar(Facilitador facilitador) {

        if (facilitador.getFacilitadorid() == 0) {
            facilitador.setEstado("Activo");
            facilitador.setFechaingreso(new Date());
            Facilitadores facilitadores = facilitadorMapper.ModelToEntity(facilitador);
            facilitadorDao.Guardar(facilitadores);
        } else {
            Facilitadores facilitadores = facilitadorMapper.ModelToEntity(facilitador);
            facilitadorDao.Modificar(facilitadores);
        }
    }

    @Override
    public void Eliminar(Facilitador facilitador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Especialidad> GetAllEspecialidades() {
        List<Especialidad> especialidades = new ArrayList<>();
        List<Especialidades> entities = especialidadDao.getEspecialidadeslist();
        for (Especialidades entity : entities) {
            Especialidad especialidad = especialidadMapper.EntityToModel(entity);
            especialidades.add(especialidad);
        }
        return especialidades;
    }
}
