/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Facade;

import Mapper.Mantenedores.BeneficiarioMapper;
import Mapper.Mantenedores.IBeneficiarioMapper;
import Modelo.Mantenedores.Beneficiario;
import ModuloCap.Dao.BeneficiariosDAO;
import ModuloCap.Entidades.Beneficiarios;
import ModuloCap.InterfacesDao.IBeneficiariosDao;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class FacadeMantBeneficiario implements IFacadeMantBeneficiario{

    private final IBeneficiariosDao beneficiarioDao;
    
    private final IBeneficiarioMapper beneficiarioMapper;

    public FacadeMantBeneficiario() {
    
        beneficiarioDao= new BeneficiariosDAO();
        
        beneficiarioMapper=new BeneficiarioMapper();
    
    }
    
    @Override
    public void GuardarBeneficiario(Beneficiario beneficiario) {
        Beneficiarios beneficiarios=beneficiarioMapper.ModelToEntity(beneficiario);
        if(beneficiarios.getBeneficiarioid()==0){
           beneficiarioDao.Guardar(beneficiarios);
        }else{
            beneficiarioDao.Modificar(beneficiarios);
        }        
    }

    @Override
    public void EliminarBeneficiario(Beneficiario beneficiario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Beneficiario> GettAllBeneficiarios() {
        
        List<Beneficiario> beneficiarios=new ArrayList<>();
        List<Beneficiarios> entities=beneficiarioDao.getBeneficiariolist();
        for(Beneficiarios entity: entities){
            Beneficiario beneficiario=beneficiarioMapper.EntiyToModel(entity);
            beneficiarios.add(beneficiario);
        }
        return beneficiarios;                
    }
    
}
