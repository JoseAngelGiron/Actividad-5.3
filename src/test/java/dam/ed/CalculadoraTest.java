package dam.ed;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculadoraTest {


    // Definimos el objeto para usarlo en todos los tests
    static Calculadora miCalculadora;

    @BeforeAll
    public static void setUpClass(){
        miCalculadora = new Calculadora();
    }

    @Test
    @DisplayName("Suma dos números")
    void testSuma() {
        assertEquals(6, miCalculadora.suma(4,2));
        assertEquals(2, miCalculadora.suma(4,-2));
        assertEquals(-6, miCalculadora.suma(-4,-2));
        assertEquals(6.8, miCalculadora.suma(3.8,3));

    }

    @Test
    @DisplayName("Resta dos números")
    void testResta() {
        assertEquals(4, miCalculadora.resta(6,2));
        assertEquals(8, miCalculadora.resta(6,-2));
        assertEquals(-4, miCalculadora.resta(-6,-2));
        assertEquals(2.3, miCalculadora.resta(3.3,1));

    }

    @Test
    @DisplayName("Potencia de dos números")
    void testPotencia() {
        assertEquals(3125, miCalculadora.potencia(5,5));
        assertEquals(1, miCalculadora.potencia(5,0));
        assertEquals(6, miCalculadora.potencia(6,1));
        assertEquals(0.04, miCalculadora.potencia(5,-2));
    }


    @Test
    @DisplayName("Multiplica dos números")
    void testMultiplicar() {
        assertEquals(6, miCalculadora.multiplica(2,3));
        assertEquals(0, miCalculadora.multiplica(5,0));
        assertEquals(16, miCalculadora.multiplica(4,4));
        assertEquals(-5, miCalculadora.multiplica(-5,1)); //He cambiado el metodo, ya que se según este caso se considera un error
    }

    @Test
    @DisplayName("Divisiones enteras y reales")
    void testDivisionesEnterasYReales() throws Exception {
        assertEquals(2, miCalculadora.divide(4,2));
        assertEquals(2.5, miCalculadora.divide(10,4));
        assertEquals(4, miCalculadora.divide(10,2.5));
        assertEquals(3.2, miCalculadora.divide(8,2.5));
        assertEquals(0.5, miCalculadora.divide(2,4));
    }

    @Test
    @DisplayName("Divisiones positivos y negativos")
    void testDivisionesPositivosYNegativos() throws Exception {
        assertTrue(miCalculadora.divide(4,2) > 0);
        assertTrue(miCalculadora.divide(4,-2)< 0);
        assertTrue(miCalculadora.divide(-4,2) < 0);
        assertTrue(miCalculadora.divide(-4,-2) > 0);
    }

    @Test
    @DisplayName("División por cero causa excepción")
    void testDivisionPorCero() {
        Exception thrown = assertThrows(Exception.class, () -> {
            miCalculadora.divide(5, 0);
        });

        assertEquals("El divisor es 0", thrown.getMessage());
    }

    @Test
    @DisplayName("Pruebas radicando")
    void testRaizCuadrada(){
        assertEquals(1,miCalculadora.raizCuadrada(1));
        assertEquals(0,miCalculadora.raizCuadrada(0));
        assertEquals(2,miCalculadora.raizCuadrada(4));
        Exception thrown = assertThrows(Exception.class, () -> {
            miCalculadora.raizCuadrada(-1);
        });

        assertEquals("El radicando no puede ser negativo", thrown.getMessage());


    }





}
