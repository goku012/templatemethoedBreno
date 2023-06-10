import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    void deveCalcularArea() {
        Circulo circulo = new Circulo("Vermelho", 3.5);
        assertEquals(38.48451000647496, circulo.calcularArea(), 0.0001);
    }

    @Test
    void deveCalcularPerimetro() {
        Circulo circulo = new Circulo("Vermelho", 3.5);
        assertEquals(21.991148575128552, circulo.calcularPerimetro(), 0.0001);
    }

    @Test
    void deveRetornarRepresentacaoString() {
        Circulo circulo = new Circulo("Vermelho", 3.5);
        assertEquals("Círculo - Cor: Vermelho", circulo.toString());
    }
}