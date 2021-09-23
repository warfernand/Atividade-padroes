package br.edu.ifpb.model;

public class Jardineiro extends Funcionario implements Contratado{

    public Jardineiro(String nome) {
        super(nome);
    }

    public void podar(){

        System.out.println(super.getNome() + "Podando...");

    }

    @Override
    public void getLucro() {

    }

    @Override
    public void setLucro() {

    }
}
