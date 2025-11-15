public class DescontoRegular implements EstrategiaDesconto {
    @Override
    public double calcular(double valor) {
        // 10% de desconto
        return valor * 0.9;
    }
}