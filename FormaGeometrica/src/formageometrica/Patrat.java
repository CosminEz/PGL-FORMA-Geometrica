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
public class Patrat implements Forma{

    @Override
    public double Arie(double X, double Y) {
        return X*X; // committed by Filote Cosmin
    }

    @Override
    public double Perimetru(double X, double Y) {
        return 4*X;  // committed by Filote Cosmin
    }
    
}
