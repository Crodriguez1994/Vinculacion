/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Procesos;

import Modelo.Mantenedores.Beneficiario;

/**
 *
 
 */
public class DetaAsistencia {
    
    private int detasistenciaid;
    private Beneficiario beneficiarioid;
    private boolean asistencia;
    private Asistencia cabasistenciaid;

    public DetaAsistencia() {
    }

    public DetaAsistencia(int detasistenciaid, Beneficiario beneficiarioid, boolean asistencia, Asistencia cabasistenciaid) {
        this.detasistenciaid = detasistenciaid;
        this.beneficiarioid = beneficiarioid;
        this.asistencia = asistencia;
        this.cabasistenciaid = cabasistenciaid;
    }

    public DetaAsistencia(Beneficiario beneficiarioid, boolean asistencia, Asistencia cabasistenciaid) {
        this.beneficiarioid = beneficiarioid;
        this.asistencia = asistencia;
        this.cabasistenciaid = cabasistenciaid;
    }

    public int getDetasistenciaid() {
        return detasistenciaid;
    }

    public void setDetasistenciaid(int detasistenciaid) {
        this.detasistenciaid = detasistenciaid;
    }

    public Beneficiario getBeneficiarioid() {
        return beneficiarioid;
    }

    public void setBeneficiarioid(Beneficiario beneficiarioid) {
        this.beneficiarioid = beneficiarioid;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    public Asistencia getCabasistenciaid() {
        return cabasistenciaid;
    }

    public void setCabasistenciaid(Asistencia cabasistenciaid) {
        this.cabasistenciaid = cabasistenciaid;
    }
    
    
    
    
}
