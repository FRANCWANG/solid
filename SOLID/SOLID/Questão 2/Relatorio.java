public class Relatorio {

    /**
     * @return O conteúdo do relatório como String.
     */
    public String gerar() {
        System.out.println("Gerando relatório de vendas...");
        String conteudo = "Vendas do dia: R$ 1.500,00\nItens vendidos: 30";
        return conteudo;
    }
}