public class PessoaJuridica extends Pessoa {
    private long cnpj;
    private String razaoSocial;
    private String nomeRepresentante;
    
    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }

    public void exibirDados() {
        System.out.println("\n\t\tPESSOA JURÍDICA" + "\n\n\tNome: " + this.getNome() + "\n\tTelefone: " + this.getTelefone() + "\n\n\tENDEREÇO: " + this.getEndereco() + 
        "\n\tCNPJ: " + this.cnpj + "\n\tRazão Social: " + this.razaoSocial + "\n\tNome Representante: " + this.nomeRepresentante);
    }

    public boolean equals(PessoaJuridica obj) {
        if (this.getCnpj() == obj.getCnpj()) {
            return true;
        } else {
            return false;
        }
    }
}