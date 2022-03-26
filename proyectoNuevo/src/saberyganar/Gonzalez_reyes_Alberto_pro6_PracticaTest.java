/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package saberyganar;

import saberyganar.Gonzalez_reyes_Alberto_pro6_Practica;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ticop
 */
public class Gonzalez_reyes_Alberto_pro6_PracticaTest {
    
    public Gonzalez_reyes_Alberto_pro6_PracticaTest() {
    }

    /**
     * Test of rondas method, of class Gonzalez_reyes_Alberto_pro6_Practica.
     */
    @Test
    public void testRondas() {
        System.out.println("rondas");
        int partida = 0;
        int expResult = 0;
        int result = Gonzalez_reyes_Alberto_pro6_Practica.rondas(partida);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of ganador method, of class Gonzalez_reyes_Alberto_pro6_Practica.
     */
    @Test
    public void testGanador() {
        System.out.println("ganador");
        String[] nombres = null;
        int[] puntuacion = null;
        String expResult = "";
        String result = Gonzalez_reyes_Alberto_pro6_Practica.ganador(nombres, puntuacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of listaFinal method, of class Gonzalez_reyes_Alberto_pro6_Practica.
     */
    @Test
    public void testListaFinal() {
        System.out.println("listaFinal");
        String[] nombres = null;
        int[] puntuacion = null;
        Gonzalez_reyes_Alberto_pro6_Practica.listaFinal(nombres, puntuacion);
        // TODO review the generated test code and remove the default call to fail.
       
        //fail("The test case is a prototype.");
    }

    /**
     * Test of puntuacion method, of class Gonzalez_reyes_Alberto_pro6_Practica.
     */
    @Test
    public void testPuntuacion() {
        System.out.println("puntuacion");
        String[] nombres = null;
        int[] puntuacion = null;
        int partida = 0;
        int[] expResult = null;
        int[] result = Gonzalez_reyes_Alberto_pro6_Practica.puntuacion(nombres, puntuacion, partida);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Gonzalez_reyes_Alberto_pro6_Practica.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Gonzalez_reyes_Alberto_pro6_Practica.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
