public class PFSemSobreposicao extends Pessoa {
    private long cpf;
    private int estadoCivil;
    
    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void exibirDados () {
        System.out.println("\n\t\tPESSOA FÍSICA" + "\n\n\tNome: " + this.getNome() + "\n\tTelefone: " + this.getTelefone() + "\n\n\tENDEREÇO: " + this.getEndereco() + 
        "\n\tCPF: " + this.cpf + "\n\tEstado Civil: " + this.estadoCivil);
    }
}