/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagithub;

import java.util.Scanner;

/**
 *
 * @author elsae
 */
public class PruebaGithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
            System.out.println("github");
             Scanner a=new Scanner(System.in);
             System.out.println("Ingrese un valor");
             int b=a.nextInt();
             System.out.println("ingrese el segundo valor");
             int c=a.nextInt();
             int d=b+c;
             System.out.println("suma ="+" "+d);
             int e=b-c;
             System.out.println("resta ="+" "+e);
              int f=b/c;
             System.out.println("resta ="+" "+f);
    }
    
}
