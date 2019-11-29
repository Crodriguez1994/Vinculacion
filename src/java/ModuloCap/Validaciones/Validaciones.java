/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Validaciones;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Christian
 */
public class Validaciones {

    public boolean ValidarCedula(String cedula) {
        FacesContext context = FacesContext.getCurrentInstance();
        boolean verificar = false;
        char[] LenghtCedula = cedula.toCharArray();
        String DigitRegion = cedula.substring(0, 2);
        int sumatotal = 0;
        if ((Integer.parseInt(DigitRegion) >= 1) && (Integer.parseInt(DigitRegion) <= 24)) {

            for (int i = 0; i < cedula.length() - 1; i++) {
                int numero = Integer.parseInt(Character.toString(LenghtCedula[i]));
                if ((i + 1) % 2 == 1) {
                    numero = Integer.parseInt(Character.toString(LenghtCedula[i])) * 2;
                    if (numero > 9) {
                        numero = numero - 9;
                    }
                }
                sumatotal += numero;
            }
            sumatotal = 10 - (sumatotal % 10);

            if (sumatotal != Integer.parseInt(cedula.substring(9))) {
                verificar = false;
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Cedula No Valida!"));
            } else {
                verificar = true;
            }
        } else {
            verificar = false;
        }

        return verificar;

    }

    public void VerificarRC(String numero) {
        FacesContext context = FacesContext.getCurrentInstance();
        int longitud = numero.length();
       if (numero.length() == 13) {
            String ruc = (numero.substring(10));
            if (!ruc.equals("001")) {  
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Ruc No Valido!"));
            }

        }

    }
}
