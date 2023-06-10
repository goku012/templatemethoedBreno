public class Retangulo extends Forma {

    private double comprimento;
    private double largura;

    public Retangulo(String cor, double comprimento, double largura) {
        super(cor);
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcularArea() {
        return comprimento * largura;
    }

    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }

    public String toString() {
        return "Retângulo - " + super.toString();
    }
}
