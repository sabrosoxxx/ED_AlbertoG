/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gonzalez_reyes_alberto_pro05;

import java.util.Scanner;

/*3. Crea un programa para registrar sueldos de hombres y mujeres de una empresa y
detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la
información de N personas distintas (valor también introducido por teclado). Para
cada persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta
información debe guardarse en una única matriz. Luego se mostrará por pantalla el
sueldo medio de cada género*/

 /*El programa lo que hace es registral sueldo de mujeres y hombres y detecta si hay brecha salarial
entre ambos, el programa te pedirá por teclado que introduzca las persona que trabajan en la empresa hombre y mujeres,
y te pedirá los sueldos de mujeres y hombres y luego te mostrará el sueldo medio de los hombres y de la mujer,
que trabajan en la empresa
**/
public class gonzalez_reyes_alberto3 {

    public static void main(String[] args) {
        //creamos la clase Scanner para introducir los datos por teclado
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el numero de personas: ");
        int numeroPersonas = entrada.nextInt();

        //creamos la matriz con numeroPersonas filas y 2 columnas
        double[][] matriz = new double[numeroPersonas][2];
//Rellenamos la matriz con el genero y el salario de cada uno
        for (int i = 0; i < numeroPersonas; i++) {

            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.print("Introduce el genero (0 para varon y 1 para mujer) ");
                    matriz[i][j] = entrada.nextInt();
                } else {
                    System.out.print("Introduce el sueldo: ");
                    matriz[i][j] = entrada.nextDouble();
                }
            }
        }

        //Creamos las variables de cuantas personas son varones o mujeres y el sueldo total de todas ellas
        int cuantosVarones = 0;
        int cuantosMujeres = 0;
        double resV = 0;
        double resM = 0;

//Recorremos la matriz para saber el genero y a traves de el sacamos el sueldo u el numero de varones o mujeres
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 2; j = j + 2) {
                if (matriz[i][j] == 0) { // es un varon
                    cuantosVarones++; // me lo suma al contador
                    //sumando cuanta muejeres hay y el valor de lo que gana el salario haciendo el sumatorio cuanto ganan
                    resV = resV + matriz[i][j + 1];
                } else if (matriz[i][j] == 1) { // sumando cuanta mujeres hay
                    cuantosMujeres++;
                    resM = resM + matriz[i][j + 1];
                }
            }
        }

//Creamos dos variables para hacer la media de sueldo de los varones y de las mujeres
        double mediaV = resV / cuantosVarones;
        double mediaM = resM / cuantosMujeres;

//Mostramos por pantalla el sueldo medio de los varones y de las mujeres
        System.out.println("El sueldo medio de los varones es de " + mediaV + " euros");
        System.out.println("El sueldo medio de las mujeres es de " + mediaM + " euros");

    }

}
