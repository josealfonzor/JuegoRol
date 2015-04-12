/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Rafael Marcano
 */
public class Mago extends Personaje{
    
    private int healPower;

    public Mago(int pt_vida, int pt_ataque, String nombre, int healPower) {
        super(pt_vida, pt_ataque, nombre);
        this.healPower = healPower;
    }

    public int getHealPower() {
        return healPower;
    }

    public void setHealPower(int healPower) {
        this.healPower = healPower;
    }
    
    public void heal (Personaje objetivo){
        if(objetivo!= null && objetivo.getPt_vida() > 0 && objetivo.getPt_vida() < Personaje.vidaMax){
        objetivo.setPt_vida(objetivo.getPt_vida() + this.healPower);
        }
    }
    
}
