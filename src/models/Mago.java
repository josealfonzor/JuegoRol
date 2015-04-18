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

    public static final int healPower=20;
    public static final int ataqueMagoBase=15;
 
    public Mago(int pt_vida, int pt_ataque, String nombre, int healPower) {
        super(pt_vida, pt_ataque, nombre);
    }

    public Mago(String nombre) {
        super(Personaje.vidaMax, ataqueMagoBase, nombre);
    }

    
    public void heal (Personaje objetivo){
        if(objetivo!= null && objetivo.getPt_vida() > 0 && objetivo.getPt_vida() < Personaje.vidaMax){
        objetivo.setPt_vida(objetivo.getPt_vida() + this.healPower);
        }
    }
    
}
