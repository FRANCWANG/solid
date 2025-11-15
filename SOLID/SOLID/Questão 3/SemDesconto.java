public class SemDesconto implements EstrategiaDesconto {
    @Override
    public double calcular(double valor) {
        // Sem desconto
        return valor;
    }
}CalculadoraDesconto.java