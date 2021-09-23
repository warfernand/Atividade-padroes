package br.edu.ifpb.model;

public class PosgresConnector implements DBConnector{

    @Override
    public void connect() {

        System.out.println("Conectado ao banco PostgresSQL");

    }
}
