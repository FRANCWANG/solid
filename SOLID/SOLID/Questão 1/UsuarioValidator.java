public class UsuarioValidator {
    
    public boolean validarSenha(String senha) {
        if (senha == null) {
            return false;
        }
        return senha.length() >= 8;
    }
}