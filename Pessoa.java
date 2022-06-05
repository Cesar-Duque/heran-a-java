public class Pessoa {
    private String nome;
    private Endereco endereco = new Endereco();
    private String telefone;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void exibirDados() {
        System.out.println("\n\tNome: " + this.nome + "\n\tTelefone: " + this.telefone + "\n\n\tENDEREÇO: " + this.endereco);
    }
}