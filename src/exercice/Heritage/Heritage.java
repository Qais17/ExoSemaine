/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice.Heritage;

import exercice.Heritage.Animaux.Entity.impl.Animal;
import exercice.Heritage.Animaux.Entity.impl.Chat;
import exercice.Heritage.Animaux.Entity.impl.Chien;
import exercice.core.Application;

/**
 *
 * @author qais-amini
 */
public class Heritage extends Application{

    @Override
    public void start() {
        Animal chien = new Chien();
        Animal chat = new Chat();
        
        chien.emmetreSon();
        chat.emmetreSon();
        
        Meuble table = new Table();
        table()
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
