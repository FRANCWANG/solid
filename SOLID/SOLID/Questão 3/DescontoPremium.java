public class DescontoPremium implements EstrategiaDesconto {
    @Override
    public double calcular(double valor) {
        // 30% de desconto
        return valor * 0.7;
    }
}