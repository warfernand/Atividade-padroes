package br.edu.ifpb.model;

public class Cozinheiro extends Funcionario implements Contratado{

    public Cozinheiro(String nome) {
        super(nome);
    }

    public void cozinhar(){

        System.out.println( super.getNome() + "Cozinhando...");

    }

    @Override
    public void getLucro() {

    }

    @Override
    public void setLucro() {

    }
}
