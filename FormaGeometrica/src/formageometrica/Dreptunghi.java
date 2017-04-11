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

    private double X,Y;

    public Dreptunghi(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public Dreptunghi() {
    }
    
    

    @Override
    public double Arie(double X, double Y) {
        System.out.println("PGL-Nu-Stie-Git :( ");
        return X*Y;
    }
    
    public double Arie1(){
        return this.X * this.Y;
    }

    @Override
    public double Perimetru(double X, double Y) {
        return 2*X;
    }

    @Override
    public double Volum(double X, double Y, double Z) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
