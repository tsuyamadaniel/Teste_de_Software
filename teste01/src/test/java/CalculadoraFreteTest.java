import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraFreteTest {

    CalculadoraFrete calculadora;

    @BeforeEach
    void preparar(){
        calculadora = new CalculadoraFrete();
    }
    @Test
    public void deveCobrarTest(){
        assertEquals(20.0, calculadora.calcular(200,false));

    }
    @Test
    public void naoDevePagar30Test(){
        assertEquals(0.0, calculadora.calcular(30,false));

    }
}

