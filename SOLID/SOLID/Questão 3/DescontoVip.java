public class DescontoVip implements EstrategiaDesconto {
    @Override
    public double calcular(double valor) {
        // 20% de desconto
        return valor * 0.8;
    }
}