package br.edu.ifpb.model;

public class Motorista extends Funcionario{
    public Motorista(String nome) {
        super(nome);
    }

    public void motorista(){

        System.out.println(super.getNome() + "Dirigindo...");

    }

}
