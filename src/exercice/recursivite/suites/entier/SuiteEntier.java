/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice.recursivite.suites.entier;

import exercice.core.Application;
import exercice.recursivite.suites.interfaces.RecursiveInterface;

/**
 *
 * @author qais-amini
 */
public class SuiteEntier extends Application implements RecursiveInterface {

    @Override
    public int suite(int n) {
      if( n<=300){
          System.out.println(n);
          return suite(n+1);
      }
      return 0;
    }

    @Override
    public void start() {
        suite(0);
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
