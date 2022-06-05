public class Main {
    public static void main(String[] args) throws Exception {
        
        // INSTANCIANDO PESSOA FISICA COM SOBREPOSIÇÃO //

        PessoaFisica pf1 = new PessoaFisica();
        PessoaFisica pf2 = new PessoaFisica();

        pf1.setNome("Vitor Silva");
        pf1.setTelefone("27 99845-6541");
        pf1.setCpf(14565413487L);
        pf1.setEstadoCivil(1);
        pf1.getEndereco().setCep("29260000");
        pf1.getEndereco().setNomeRua("Rua Antonio Marcos Vasconselos");
        pf1.getEndereco().setNumCasa("211");
        
        pf2.setNome("Larissa Azevedo");
        pf2.setTelefone("27 99956-7890");
        pf2.setCpf(14565413487L);
        pf2.setEstadoCivil(2);
        pf2.getEndereco().setCep("45667385");
        pf2.getEndereco().setNomeRua("Rua Marcelo Pinto de Aguiar");
        pf2.getEndereco().setNumCasa("176");
        
        // INSTANCIANDO PESSOA JURIDICA COM SOBREPOSIÇÃO //

        PessoaJuridica pj1 = new PessoaJuridica();
        PessoaJuridica pj2 = new PessoaJuridica();
        
        pj1.setNome("Miguel de Freitas Rocha");
        pj1.setTelefone("27 99769-4971");
        pj1.setCnpj(31483241000162L);
        pj1.setRazaoSocial("J.L. Rocha Junior ME");
        pj1.setNomeRepresentante("Rocha Locadora");
        pj1.getEndereco().setCep("29260000");
        pj1.getEndereco().setNomeRua("Avenida Presidente Vargas");
        pj1.getEndereco().setNumCasa("471");
        
        pj2.setNome("Cesar Duque Leal Silva");
        pj2.setTelefone("27 99845-6541");
        pj2.setCnpj(31483241000138L);
        pj2.setRazaoSocial("Dance Club da Praia");
        pj2.setNomeRepresentante("Let´s Vila Velha");
        pj2.getEndereco().setCep("29101701");
        pj2.getEndereco().setNomeRua("Rua Matheus Brasileiro Tritão");
        pj2.getEndereco().setNumCasa("314");
    
        // EXIBINDO DADOS COM SOBREPOSIÇÃO //
        System.out.println("\n\n\t\tDADOS COM SOBREPOSIÇÃO:\n");
        pf1.exibirDados();
        pf2.exibirDados();
        
        pj1.exibirDados();
        pj2.exibirDados();
    
        System.out.println("\n\n\tOs CPFs são iguais? (True para sim) ou (False para não): " + pf1.equals(pf2));
        System.out.println("\n\n\tOs CNPJs são iguais? (True para sim) ou (False para não): " + pj1.equals(pj2));
    
    
    
        
        // INSTANCIANDO PESSOA FISICA SEM SOBREPOSIÇÃO //
        
        PFSemSobreposicao pf1SemSob = new PFSemSobreposicao();
        PFSemSobreposicao pf2SemSob = new PFSemSobreposicao();

        pf1SemSob.setNome("Marcus Mendes");
        pf1SemSob.setTelefone("27 99456-2344");
        pf1SemSob.setCpf(14565413487L);
        pf1SemSob.setEstadoCivil(1);
        pf1SemSob.getEndereco().setCep("29101850");
        pf1SemSob.getEndereco().setNomeRua("Rua Itaquari");
        pf1SemSob.getEndereco().setNumCasa("113");
        
        pf2SemSob.setNome("Thomas Hoffman");
        pf2SemSob.setTelefone("27 99743-5688");
        pf2SemSob.setCpf(14565413487L);
        pf2SemSob.setEstadoCivil(2);
        pf2SemSob.getEndereco().setCep("23455387");
        pf2SemSob.getEndereco().setNomeRua("Rua Cruzeiro do Sul");
        pf2SemSob.getEndereco().setNumCasa("256");


         // INSTANCIANDO PESSOA JURIDICA SEM SOBREPOSIÇÃO //
    
        PJSemSobreposicao pj1SemSob = new PJSemSobreposicao();
        PJSemSobreposicao pj2SemSob = new PJSemSobreposicao();
         
        pj1SemSob.setNome("Bruno Marques Rodrigues");
        pj1SemSob.setTelefone("27 99765-4895");
        pj1SemSob.setCnpj(25486984000187L);
        pj1SemSob.setRazaoSocial("Bruno M. Rodrigues");
        pj1SemSob.setNomeRepresentante("Petiscaria do Bruninho");
        pj1SemSob.getEndereco().setCep("24546012");
        pj1SemSob.getEndereco().setNomeRua("Avenida Santo Antônio");
        pj1SemSob.getEndereco().setNumCasa("1452");
         
        pj2SemSob.setNome("Ronaldo Klein Brasil");
        pj2SemSob.setTelefone("27 99945-7894");
        pj2SemSob.setCnpj(25486984000187L);
        pj2SemSob.setRazaoSocial("R.K.B. Boutique EIRELI");
        pj2SemSob.setNomeRepresentante("Loja Fina Estampa");
        pj2SemSob.getEndereco().setCep("25486065");
        pj2SemSob.getEndereco().setNomeRua("Travessa Reginaldo Rossi");
        pj2SemSob.getEndereco().setNumCasa("1001");
    
        // EXIBINDO DADOS SEM SOBREPOSIÇÃO //
        System.out.println("\n\n\t\tDADOS SEM SOBREPOSIÇÃO:\n");
        pf1SemSob.exibirDados();
        pf2SemSob.exibirDados();
        
        pj1SemSob.exibirDados();
        pj2SemSob.exibirDados();
    
        System.out.println("\n\n\tOs CPFs são iguais? (True para sim) ou (False para não): " + pf1SemSob.equals(pf2SemSob));
        System.out.println("\n\n\tOs CNPJs são iguais? (True para sim) ou (False para não): " + pj1SemSob.equals(pj2SemSob));
    }
}