public class Pomba extends Ave implements AveVoadora {

    @Override
    public void voar() {
        System.out.println("Pomba voando...");
    }

    @Override
    public void comer() {
        System.out.println("Pomba comendo pão...");
    }
}