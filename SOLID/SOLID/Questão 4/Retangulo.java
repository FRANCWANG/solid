public class Retangulo implements Forma {
    double largura, altura;
    
    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Implementação do contrato da interface
    @Override
    public double calcularArea() {
        return this.largura * this.altura;
    }
}