public class Carro extends Veiculo implements Motorizado {

    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro... Vrum!");
    }
}