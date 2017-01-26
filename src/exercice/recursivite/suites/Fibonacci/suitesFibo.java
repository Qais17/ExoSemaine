/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice.recursivite.suites.Fibonacci;

import exercice.core.Application;
import exercice.recursivite.suites.interfaces.RecursiveInterface;

/**
 *
 * @author qais-amini
 */
public class suitesFibo extends Application implements RecursiveInterface {

    @Override
    public int suite(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       public int max = 23;
    public int prc = 0;

    public int suites(int n) {
        max--;
        System.out.println(prc);
        
    
    
        if (max > 0){
            int temp = n + prc; // temp correspond a n
        prc = n;
            suites(temp);
        }
        return 0;
    }
    
}
