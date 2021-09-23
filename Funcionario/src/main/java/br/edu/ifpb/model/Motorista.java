package br.edu.ifpb.model;

public class Motorista extends Funcionario implements Contratado, Rastreavel{

    public Motorista(String nome) {
        super(nome);
    }

    public void dirigir(){

        System.out.println(super.getNome() + "Dirigindo...");

    }

    //[O]pen/Closed Principle (Princípio do Aberto/Fechado)
    public void dirigir(String veiculo){

        System.out.println(super.getNome() + "esta dirigindo um(a) " + veiculo);

    }

    @Override
    public void getLucro() {

    }

    @Override
    public void setLucro() {

    }

    @Override
    public void getCurrentLocation() {

    }

    @Override
    public void setCurrentLocation() {

    }
}
