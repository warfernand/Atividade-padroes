package br.edu.ifpb.model;

public class Cozinheiro extends Funcionario{

    public Cozinheiro(String nome) {
        super(nome);
    }

    public void cozinheiro(){

        System.out.println( super.getNome() + "Cozinhando...");

    }

}
