public class Main {

    public static void main(String[] args) {
        Relatorio r = new Relatorio();
        
        PersistenciaRelatorio p = new PersistenciaRelatorio();

        String conteudoDoRelatorio = r.gerar();
        
        p.salvarEmArquivo(conteudoDoRelatorio);
    }
}