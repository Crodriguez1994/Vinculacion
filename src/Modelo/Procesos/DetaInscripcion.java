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
public class DetaInscripcion {
    
    private int detainsid;
    private Beneficiario beneficiarioid;
    private Inscripcion cabInscr;

    public DetaInscripcion() {
    }

    public DetaInscripcion(int detainsid, Beneficiario beneficiarioid, Inscripcion cabInscr) {
        this.detainsid = detainsid;
        this.beneficiarioid = beneficiarioid;
        this.cabInscr = cabInscr;
    }

    
    public DetaInscripcion(Beneficiario beneficiarioid, Inscripcion cabInscr) {
        this.beneficiarioid = beneficiarioid;
        this.cabInscr = cabInscr;
    }

    public int getDetainsid() {
        return detainsid;
    }

    public void setDetainsid(int detainsid) {
        this.detainsid = detainsid;
    }

    public Beneficiario getBeneficiarioid() {
        return beneficiarioid;
    }

    public void setBeneficiarioid(Beneficiario beneficiarioid) {
        this.beneficiarioid = beneficiarioid;
    }

    public Inscripcion getCabInscr() {
        return cabInscr;
    }

    public void setCabInscr(Inscripcion cabInscr) {
        this.cabInscr = cabInscr;
    }
    
    
    
}
