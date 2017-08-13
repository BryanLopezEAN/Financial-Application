/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalproject;

/**
 *
 * @author Bryan Lopez Avila
 */
public class Salidas {
    private int alimentacion, transporte, arriendo, deudas, otros;

    public Salidas(int alimentacion, int transporte, int arriendo, int deudas, int otros) {
        this.alimentacion = alimentacion;
        this.transporte = transporte;
        this.arriendo = arriendo;
        this.deudas = deudas;
        this.otros = otros;
    }

    public int getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(int alimentacion) {
        this.alimentacion = alimentacion;
    }

    public int getTransporte() {
        return transporte;
    }

    public void setTransporte(int transporte) {
        this.transporte = transporte;
    }

    public int getArriendo() {
        return arriendo;
    }

    public void setArriendo(int arriendo) {
        this.arriendo = arriendo;
    }

    public int getDeudas() {
        return deudas;
    }

    public void setDeudas(int deudas) {
        this.deudas = deudas;
    }

    public int getOtros() {
        return otros;
    }

    public void setOtros(int otros) {
        this.otros = otros;
    }
    
    public int sum(){
        return this.alimentacion + this.transporte + this.arriendo + this.deudas + this.otros;
    }
}
