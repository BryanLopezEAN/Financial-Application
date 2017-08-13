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
public class Ingresos {
    private int sueldo, tExternos, otros;

    public Ingresos(int sueldo, int tExternos, int otros) {
        this.sueldo = sueldo;
        this.tExternos = tExternos;
        this.otros = otros;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int gettExternos() {
        return tExternos;
    }

    public void settExternos(int tExternos) {
        this.tExternos = tExternos;
    }

    public int getOtros() {
        return otros;
    }

    public void setOtros(int otros) {
        this.otros = otros;
    }
    
    public int sum(){
        return this.sueldo + this.tExternos + this.otros;
    }
}
