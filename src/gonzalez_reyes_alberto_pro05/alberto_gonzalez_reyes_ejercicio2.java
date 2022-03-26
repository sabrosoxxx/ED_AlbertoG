/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gonzalez_reyes_alberto_pro05;

import java.util.Scanner;

/*2. Realiza un programa que lea una frase por teclado e indique si la frase es un
palíndromo o no (ignorando espacios y sin diferenciar entre mayúsculas y
minúsculas). Supondremos que el usuario solo introducirá letras y espacios (ni
comas, ni puntos, ni acentos, etc.). Un palíndromo es un texto que se lee igual de
izquierda a derecha que de derecha a izquierda. Por ejemplo:
Anita lava la tina
Dábale arroz a la zorra el abad
Amo la pacífica paloma
Somos o no somos
Sé verlas al revés*/

 /*Este programa trata de leer una frase (el usuario introduce la frase),
por teclado y el programa te dice si es un palíndromo o no es un palíndromo,
el programa te va ignorar el espacio y no te va a diferencial entre mayúscula, 
minúscula ni comas ni acentos.  **/
public class alberto_gonzalez_reyes_ejercicio2 {

    public static void main(String[] args) {
        //Inicializamos el escanner para escribir por teclado
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba una frase: ");
        //guardamos la frase en un String
        String frase = entrada.nextLine(); // esto sirve para escribir una frase
        //Cambiamos las mayusculas por minusculas toLowerCase()y quitamos los espacios en blanco replace(" ","");
        String texto = frase.toLowerCase().replace(" ", "");
        //creamos un booleano a true para saber cuando parar y mostrarlo por pantalla
        boolean pal = true;
        //Recorremos el String y entre 2 porque solo nesecito la mitad 
        for (int i = 0; i < (texto.length() / 2) && pal; i++) { // mientra que pal sea verdadero siga buscando si no para el el bucle
            //Comprobamos si el caracter de la posicion i de texto es igual al caracter de la ultima posicion -i       
            if (texto.charAt(i) != texto.charAt((texto.length() - 1) - i)) { // va letra por letra comprobando
                pal = false;
            }
        }
        //La solucion que se mostrara por pantalla
        if (pal == false) {
            System.out.println("La frase " + frase + " no es palindromo");
        } else {
            System.out.println("La frase " + frase + " es palindromo");
        }

    }
}
