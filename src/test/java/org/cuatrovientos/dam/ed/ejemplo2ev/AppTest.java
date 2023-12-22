package org.cuatrovientos.dam.ed.ejemplo2ev;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    public void testSumar() {
    	Calculadora calculadora = new Calculadora();
    	int resultado = calculadora.sumar ("1","1");
    	
    }
}
