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
    public Double Volum(){
        Double volum=new Double(0.0);
        System.out.println(volum);
        return volum;
    }

    @Override
    public double Volum(double X, double Y, double Z) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
