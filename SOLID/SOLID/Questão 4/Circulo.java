public class Circulo implements Forma {
    double raio;
    
    Circulo(double raio) { 
        this.raio = raio; 
    }

    // Implementação do contrato da interface
    @Override
    public double calcularArea() {
        return Math.PI * this.raio * this.raio;
    }
}