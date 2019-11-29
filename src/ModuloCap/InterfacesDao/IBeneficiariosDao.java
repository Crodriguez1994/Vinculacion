/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.InterfacesDao;

import ModuloCap.Entidades.Beneficiarios;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface IBeneficiariosDao {

    public Beneficiarios getBeneficiarioId(int beneficiarioid);

    public void Guardar(Beneficiarios beneficiario);

    public void Modificar(Beneficiarios beneficiario);

    public void Eliminar(Beneficiarios beneficiario);

    public List<Beneficiarios> getBeneficiariolist();

    public int getNextId();
}
