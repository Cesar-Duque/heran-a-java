public class Endereco {
    private String nomeRua;
    private String cep;
    private String numCasa;

    public String toString() {
        return "\n\tNome da Rua: " + nomeRua + "\n\tNúmero: " + numCasa + "\n\tCEP: " + cep;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(String numCasa) {
        this.numCasa = numCasa;
    }
}