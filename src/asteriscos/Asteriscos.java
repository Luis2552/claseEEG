/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteriscos;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author Alex
 */
public class Asteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Random alea = new Random();
   int num1=alea.nextInt(20)+1;
   int num2= alea.nextInt(20)+1;
   int num3= alea.nextInt(20)+1;
   int num4= alea.nextInt(20)+1;
    System.out.println(+num1);
    System.out.println(+num2);
    System.out.println(+num3);
    System.out.println(+num4);
    }
    
    
}
