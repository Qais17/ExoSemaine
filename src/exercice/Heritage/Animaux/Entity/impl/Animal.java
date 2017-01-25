/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice.Heritage.Animaux.Entity.impl;

/**
 *
 * @author qais-amini
 */
public class Animal {
    public String son="";
   public void emmetreSon(){
   System.out.println("le " + this.getClass().getSimpleName() + son);
   };
}
