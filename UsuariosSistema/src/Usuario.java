public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private boolean administrador;

    public Usuario(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void realizarLogin() {
        System.out.println("Login realizado com sucesso.");
    }

    public void realizarLogoff() {
        System.out.println("Logoff realizado com sucesso.");
    }

    public void alterarDados(String nome, String email) {
        this.nome = nome;
        this.email = email;
        System.out.println("Dados alterados com sucesso.");
    }

    public void alterarSenha(String senha) {
        this.senha = senha;
        System.out.println("Senha alterada com sucesso.");
    }
}
