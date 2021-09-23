package br.edu.ifpb.model;

public class Funcionario {

    private String nome;

    public void cozinheiro(){

        System.out.println(this.nome + "Cozinhando...");

    }

    public void jardineiro(){

        System.out.println(this.nome + "Podando...");

    }

    public void pintor(){

        System.out.println(this.nome + "Pintando...");

    }

    public void motorista(){

        System.out.println(this.nome + "Dirigindo...");

    }

}
