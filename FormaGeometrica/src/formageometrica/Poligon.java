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
public class Poligon implements Forma{

    @Override
    public double Arie(double X, double Y) {
        
        return 3*X;
    }

    @Override
    public double Perimetru(double X, double Y) {
        return 2*X + 2* Y;
    }
    
}
