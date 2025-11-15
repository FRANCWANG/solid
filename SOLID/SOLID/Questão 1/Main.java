public class Main {
    
    public static void main(String[] args) {
        UsuarioRepository repository = new UsuarioRepository();
        EmailService emailService = new EmailService();
        UsuarioValidator validator = new UsuarioValidator();

        String nome = "Ana";
        String email = "ana@email.com";
        String senha = "12345678";

        if (validator.validarSenha(senha)) {
            Usuario u = new Usuario(nome, email);
            
            repository.cadastrar(u);
            emailService.enviarEmailBoasVindas(u);
        } else {
            System.out.println("Cadastro não realizado: senha inválida.");
        }
    }
}