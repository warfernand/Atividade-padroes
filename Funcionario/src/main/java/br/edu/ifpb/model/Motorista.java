package br.edu.ifpb.model;

public class Motorista extends Funcionario{

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

}
