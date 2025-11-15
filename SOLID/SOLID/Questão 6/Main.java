public class Main {
    public static void main(String[] args) {

        // Cenário 1: Usando uma Bicicleta
        Bicicleta bike = new Bicicleta();
        bike.transportar();
        bike.pedalar();

        // Cenário 2: Usando um Carro
        Carro carro = new Carro();
        carro.transportar();
        carro.acelerar();

        Motorizado veiculoMotorizado = new Carro();
        veiculoMotorizado.acelerar();
    }
}