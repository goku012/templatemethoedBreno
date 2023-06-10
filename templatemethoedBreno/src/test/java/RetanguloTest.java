import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    @Test
    void deveCalcularArea() {
        Retangulo retangulo = new Retangulo("Azul", 4.5, 3.0);
        assertEquals(13.5, retangulo.calcularArea(), 0.0001);
    }

    @Test
    void deveCalcularPerimetro() {
        Retangulo retangulo = new Retangulo("Azul", 4.5, 3.0);
        assertEquals(15.0, retangulo.calcularPerimetro(), 0.0001);
    }

    @Test
    void deveRetornarRepresentacaoString() {
        Retangulo retangulo = new Retangulo("Azul", 4.5, 3.0);
        assertEquals("Retângulo - Cor: Azul", retangulo.toString());
    }
}