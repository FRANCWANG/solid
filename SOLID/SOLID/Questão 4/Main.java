public class Main {
    public static void main(String[] args) {
        CalculadoraArea calc = new CalculadoraArea();

        Forma c = new Circulo(5);
        Forma r = new Retangulo(4, 6);

        System.out.println("Área do círculo: " + calc.calcularArea(c));
        System.out.println("Área do retângulo: " + calc.calcularArea(r));
    }
}