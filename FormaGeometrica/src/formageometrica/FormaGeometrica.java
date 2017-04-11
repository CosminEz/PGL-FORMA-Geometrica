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
public class FormaGeometrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dreptunghi D1=new Dreptunghi(4,5);
        System.out.println(D1.Arie1());
        System.out.println(new Dreptunghi(5,6).Arie1());
    }
    
}
