package teste;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    
    public static final double VALOR_ESPERADO = 11.0;

    @Test
    public void farineitToCelcius(){
        double fahrenheit = 50.0;
        double valor = (fahrenheit-32)*5/9;
        assertEquals(VALOR_ESPERADO, valor);
    }
}
