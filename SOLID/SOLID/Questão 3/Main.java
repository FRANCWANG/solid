// Main.java
public class Main {

    public static void main(String[] args) {
        CalculadoraDesconto calc = new CalculadoraDesconto();
        double valorCompra = 100.0;

        // 1. Cenário Cliente VIP
        EstrategiaDesconto estrategiaVip = new DescontoVip();
        double precoVip = calc.calcular(estrategiaVip, valorCompra);
        System.out.println("Desconto VIP: " + precoVip);

        // 2. Cenário Cliente Regular
        EstrategiaDesconto estrategiaRegular = new DescontoRegular();
        double precoRegular = calc.calcular(estrategiaRegular, valorCompra);
        System.out.println("Desconto Regular: " + precoRegular);
        
        // 3. Cenário Cliente Padrão
        EstrategiaDesconto estrategiaPadrao = new SemDesconto();
        double precoPadrao = calc.calcular(estrategiaPadrao, valorCompra);
        System.out.println("Sem Desconto: " + precoPadrao);

        // 4. NOVO CENÁRIO ADICIONADO
        
        EstrategiaDesconto estrategiaPremium = new DescontoPremium();
        double precoPremium = calc.calcular(estrategiaPremium, valorCompra);
        System.out.println("Desconto Premium: " + precoPremium);
    }
}