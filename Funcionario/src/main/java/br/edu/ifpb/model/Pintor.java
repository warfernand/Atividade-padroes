package br.edu.ifpb.model;

public class Pintor extends Funcionario{

    public Pintor(String nome) {
        super(nome);
    }

    public void pintar(){

        System.out.println(super.getNome() + "Pintando...");

    }

}
