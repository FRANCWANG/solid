public interface EstrategiaDesconto {
    /**
     * Calcula o valor final após aplicar o desconto.
     * @param valor O valor original da compra.
     * @return O valor com o desconto aplicado.
     */
    double calcular(double valor);
}