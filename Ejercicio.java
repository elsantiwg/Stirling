/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author kspg2
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
   
        Scanner scan = new Scanner(System.in);
        System.out.print("hasta que numero quieres calcular?");
        int n = scan.nextInt();
        double PI = Math.PI;
        double stirling = Math.pow(n, n) * (Math.exp(-n) * (Math.sqrt(2 * PI * n)));
        System.out.println("aproximadamente es " + stirling);

    }

}