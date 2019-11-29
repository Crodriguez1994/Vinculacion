/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Mantenedores;

/**
 *
 
 */
public class DetaHorario {
    
    private int detahorarioid;
    private Dias diaid;
    private String horainicio;
    private String horafin;
    private Horario cabhorarioid;

    public DetaHorario() {
    }

    public DetaHorario(int detahorarioid, Dias diaid, String horainicio, String horafin, Horario cabhorarioid) {
        this.detahorarioid = detahorarioid;
        this.diaid = diaid;
        this.horainicio = horainicio;
        this.horafin = horafin;
        this.cabhorarioid = cabhorarioid;
    }

    public int getDetahorarioid() {
        return detahorarioid;
    }

    public void setDetahorarioid(int detahorarioid) {
        this.detahorarioid = detahorarioid;
    }

    public Dias getDiaid() {
        return diaid;
    }

    public void setDiaid(Dias diaid) {
        this.diaid = diaid;
    }

    public String getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }

    public String getHorafin() {
        return horafin;
    }

    public void setHorafin(String horafin) {
        this.horafin = horafin;
    }

    public Horario getCabhorarioid() {
        return cabhorarioid;
    }

    public void setCabhorarioid(Horario cabhorarioid) {
        this.cabhorarioid = cabhorarioid;
    }
    
    
    
    
}
