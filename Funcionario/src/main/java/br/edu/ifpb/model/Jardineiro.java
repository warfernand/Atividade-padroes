package br.edu.ifpb.model;

public class Jardineiro extends Funcionario{

    public Jardineiro(String nome) {
        super(nome);
    }

    public void jardineiro(){

        System.out.println(super.getNome() + "Podando...");

    }

}
