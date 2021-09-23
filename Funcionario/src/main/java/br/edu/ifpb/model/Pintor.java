package br.edu.ifpb.model;

public class Pintor extends Funcionario implements Contratado{

    public Pintor(String nome) {
        super(nome);
    }

    public void pintar(){

        System.out.println(super.getNome() + "Pintando...");

    }

    @Override
    public void getLucro() {

    }

    @Override
    public void setLucro() {

    }
}
