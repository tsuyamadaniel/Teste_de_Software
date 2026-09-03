import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    void deveSomarDoisFatores(){
       int resultado = calculadora.somar(2,2);
       assertEquals(4, resultado);

    }
    @Test
    void deveSubtrairFatores(){
        int resultado = calculadora.subtrair(5,2);
        assertEquals(3, resultado);
    }
    @Test
    void deveMultiplicar(){
        int resultado = calculadora.multiplicar(2, 2);
        assertEquals(4, resultado);
    }
    @Test
    void deveDividir(){
        int resultado = calculadora.dividir(4,2);
        assertEquals(2, resultado);
    }
}
