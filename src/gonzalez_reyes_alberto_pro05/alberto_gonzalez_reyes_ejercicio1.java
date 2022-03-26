package gonzalez_reyes_alberto_pro05;

import java.util.Scanner;

/*Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros
aleatorios entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por teclado un
valor N y se mostrará por pantalla si N existe en el array, además de cuantas veces.*/

 /*Este programa creara 1000 número de forma aleatorio al azar y le agregara valores del o al 99 luego el programa 
nos pedirá que ingresemos un numero luego el programa nos dirá si ese número ingresado esta entre los números aleatorio 
y cuantas ves esta*/
public class alberto_gonzalez_reyes_ejercicio1 {

    public static void main(String[] args) {
        // creamos una variable de tipo entero que es la que metere por teclado
        int numero;
        //creamos la clase scanner
        Scanner entrada = new Scanner(System.in);
        //pedimos una entrada por tantalla de 0 a 99
        System.out.print("Escriba un numero en pantalla entre el 0 y el 99: ");
        //entrada va hacer por teclado en numeros
        numero = entrada.nextInt();
        // una variable constante de tamaño 1000
        final int tamano = 1000;
        //creamos el arrays y le insertamos el valor tamaño y tamño tiene 1000 
        int[] arrays = new int[tamano]; // era otra opcion mas corta ( int [] array = new int [1000];)
        for (int i = 0; i < arrays.length; i++) {
            // esto va a rellenar el arrays con numero aleatorio entre 0 y 99
            // la clase random da valores de double, entonces hacemos un castin
            arrays[i] = (int) (Math.random() * 100);//  (int) sirve para forzar que un tipo(double) pase a otro (int)

        }
        // creamos una variable que va actualizar de uno a uno
        int cuantos = 0;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == numero) {
                cuantos++; // otra opcion mas larga  cuantos=cuantos+1;
            }

        }
        // cuantos igual a cero no existe
        if (cuantos == 0) {
            System.out.println("El numero " + numero + " no existe en el array");
        } // cunatos mayor que cero si existe y cunatas veces..............................
        else {
            System.out.println("El numero " + numero + " existe en el array y se repite " + cuantos + " veces");
        }
    }

}
