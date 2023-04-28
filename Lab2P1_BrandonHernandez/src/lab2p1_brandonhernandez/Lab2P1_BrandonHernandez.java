/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_brandonhernandez;

import java.util.Scanner;

/**
 *
 * @author brhb2
 */
public class Lab2P1_BrandonHernandez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Clasificando Numeros");
        System.out.println("2. Aproximando PI");
        System.out.println("3. Maximo Comun Divisor");
        System.out.println("4. Salir");
        System.out.println("Ingrese su opcion: ");
        int opcion = 0;
        opcion = Leer.nextInt();

        while (opcion != 4) {// Inicio del while

            switch (opcion) {// Incio del switch

                case 1:
                        System.out.println("Ingrese el numero que desea evaluar: ");
                        int numero = Leer.nextInt();

                        while (numero <= 0) {
                            System.out.println("Por favor ingrese un numero mayor a cero");
                            numero = Leer.nextInt();
                        }
                        boolean par = true;
                        if (numero % 2 != 0) {
                            par = false;
                        }

                        int contador1 = 1;
                        int contador2 = 0;
                        boolean primo = true;
                        while (contador1 <= numero) {

                            if (numero % contador1 == 0) {
                                contador2++;
                            }
                            contador1++;

                            if (contador2 > 2) {
                                primo = false;
                            }
                        }

                        if (par == true && primo == true) {
                            System.out.println("El numero ingresado es par y primo");
                        } else if (par == false && primo == true) {
                            System.out.println("El numero ingresado es impar y es primo");
                        } else if (par == true && primo == false) {
                            System.out.println("El numero ingresado es par");
                        } else {
                            System.out.println("El numero ingresado es impar");
                        }
                    break;

                case 2:
                    System.out.println("Ingrese la presicion del calculo: ");
                    numero = Leer.nextInt();
                    double i = 1;
                    double resultado = 1;
                    
                    while (i <= numero){
                        
                        double dividendo = 4 * Math.pow(i, 2);
                        double divisor = 4 * Math.pow(i, 2) - 1;
                        resultado = resultado * (dividendo / divisor);       
                        i++;
                    }
                    resultado*=2;                       
                    System.out.println("PI: "+resultado);
                    
                    break;
                    
                case 3:
                    System.out.println("Ingrese el primer numero: ");
                    int num1 = Leer.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    int num2 = Leer.nextInt();
                    
                    while ((num1 <=0) && (num2 <= 0)){
                        System.out.println("Por favor ingrese un numero positivo y entero");
                        num1 = Leer.nextInt();
                        num2 = Leer.nextInt();
                    }
    
                    while (num1 != num2){
                        if (num1 > num2){
                            num1 = num1 - num2;
                            

                        }
                        else {
                            num2 = num2 - num1;
                            ;
                        }
                        if (num1 == num2){
                        System.out.println("El MCD es: "+num1);
                    }
                    }
                    

            }// Fin del switch
            System.out.println("Menu");
            System.out.println("1. Clasificando Numeros");
            System.out.println("2. Aproximando PI");
            System.out.println("3. Maximo Comun Divisor");
            System.out.println("4. Salir");
            System.out.println("Ingrese su opcion: ");
            opcion = 0;
            opcion = Leer.nextInt();
        }// Fin del while

    } // Fin del public static void
}// Fin del public class
