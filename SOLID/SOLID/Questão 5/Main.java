public class Main {
    public static void main(String[] args) {
        
        Ave pinguimComoAve = new Pinguim();
        pinguimComoAve.comer();
        pinguimComoAve.botarOvo();

        Pinguim pinguimReal = new Pinguim();
        pinguimReal.nadar();

        Ave pombaComoAve = new Pomba();
        pombaComoAve.comer();

        AveVoadora pombaVoadora = new Pomba();
        pombaVoadora.voar();
    }
}