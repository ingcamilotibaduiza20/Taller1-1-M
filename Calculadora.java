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
        System.out.println("Ingrese la operacion a realizar:\n1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Potencia\n6. Raiz\n7. Seno\n8. Coseno\n9. Tangente\n10. Raiz n\n11. Iva");
        opc = leer.nextInt();
        
        System.out.println("Ingrese el primer número");
        n1 = leer.nextInt();
        
        if(opc !=6){
           System.out.println("Ingrese el segundo número");
        n2 = leer.nextInt(); 
        }
        
        switch(opc){
            case 1 -> {
                res = n1 + n2;
                System.out.println("La suma de los dos numeros es: "+res);
            }
            case 2 -> {
                res = n1 - n2;
                System.out.println("La resta de los dos numeros es: "+res);
            }
            case 3 -> {
                res = n1 * n2;
                System.out.println("La multiplicación de los dos numeros es: "+res);
            }
            case 4 -> {
                res = n1 / n2;
                System.out.println("La división entre los dos numeros es: "+res);
            }
            case 5 -> {
                res = (int) Math.pow(n1,n2);
                System.out.println("La potencia entre los dos numeros es: "+res);
            }
            case 6 -> {
                res = (int) Math.sqrt(n1);
                System.out.println("La raíz cuadrada del numero dijitado es: "+res);
            }
            case 7 -> {
                System.out.println("Ingrese el ángulo en grados:");
                double angle = leer.nextDouble();
                double radians = Math.toRadians(angle);
                double sinValue = Math.sin(radians);
                System.out.println("El seno de " + angle + " grados es: " + sinValue);
            }
            case 8 -> {
                System.out.println("Ingrese el ángulo en grados:");
                double angle = leer.nextDouble();
                double radians = Math.toRadians(angle);
                double cosValue = Math.cos(radians);
                System.out.println("El coseno de " + angle + " grados es: " + cosValue);
             }
            case 9 -> {
                System.out.println("Ingrese el ángulo en grados:");
                double angle = leer.nextDouble();
                double radians = Math.toRadians(angle);
                double tanValue = Math.tan(radians);
                System.out.println("La tangente de " + angle + " grados es: " + tanValue);
            }
            case 10 -> {
                System.out.println("Ingrese el índice de la raíz:");
                int index = leer.nextInt();
                double rootValue = Math.pow(n1, 1.0 / index);
                System.out.println("La raíz " + index + " de " + n1 + " es: " + rootValue);
            }
            case 11 -> {
                System.out.println("Ingrese el porcentaje de IVA:");
                double ivaPercentage = leer.nextDouble();
                System.out.println("Ingrese el valor al que se aplicará el IVA:");
                double value = leer.nextDouble();
                double ivaAmount = (ivaPercentage / 100) * value;
                double totalValue = value + ivaAmount;
                System.out.println("El monto del IVA es: " + ivaAmount);
                System.out.println("El total con IVA es: " + totalValue);
            }
            default -> System.out.println("Opción no válida.");
        }
    }
}
