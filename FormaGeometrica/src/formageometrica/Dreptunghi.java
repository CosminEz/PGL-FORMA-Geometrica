/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formageometrica;

/**
 *
 * @author Lenovo
 */
public class Dreptunghi implements Forma{

    @Override
    public double Arie(double X, double Y) {
        System.out.println("PGL-Nu-Stie-Git :( ");
        return X*Y;
    }

    @Override
    public double Perimetru(double X, double Y) {
        return 2*X;
    }
    
}
