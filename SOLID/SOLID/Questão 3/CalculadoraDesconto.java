public class CalculadoraDesconto {

    /**
     * Calcula o valor baseado em uma estratégia de desconto fornecida.
     */
    public double calcular(EstrategiaDesconto estrategia, double valor) {
        // Delega o cálculo para o objeto da estratégia
        return estrategia.calcular(valor);
    }
}