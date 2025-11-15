public class EmailService {
    
    public void enviarEmailBoasVindas(Usuario usuario) {
        System.out.println("Enviando e-mail de boas-vindas para: " + usuario.getEmail());
    }
}