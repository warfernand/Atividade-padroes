package br.edu.ifpb.model.App;

import br.edu.ifpb.model.Funcionario;
import br.edu.ifpb.model.Motorista;

public class App {

    public static void main(String[] args) {

        //Funcionario func1 = new Motorista();

        printFuncionario(new Motorista("Fernando"));

    }

    private static void printFuncionario(Funcionario funcionario){

        if(funcionario instanceof Motorista){

            Motorista motorista = (Motorista) funcionario;
            motorista.dirigir();

        }
    }

}
