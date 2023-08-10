package com.mycompany.calculadora;
import java.util.Scanner;
//@author Camilo Tibaduiza Melgarejo

public class Calculadora {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        int res;
        int n1 = 0;
        int n2 = 0;
        System.out.println("Ingrese la operacion a realizar: \t1. Suma\t2. Resta\t3. Multiplicación\t4. División");
        opc = leer.nextInt();
        
        System.out.println("Ingrese el primer número");
        n1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo número");
        n2 = leer.nextInt();
        
        switch(opc){
            case 1: res = n1 + n2;
                System.out.println("La suma de los dos numeros ");
        }
    }
}
