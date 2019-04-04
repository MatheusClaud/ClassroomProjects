package Projeto;

import java.util.Scanner;

public class Menu {

    Scanner s = new Scanner(System.in);
    private Opcao[] opcao;
    private Agenda agenda;
    private String invalido = "OPÇÂO INVÁLIDA!";


    public Menu(){
        opcao = new Opcao[4];

        opcao[0] = new Opcao("C", "(C)adastrar Contato");
        opcao[1] = new Opcao("L", "(L)istar Contatos");
        opcao[2] = new Opcao("E", "(E)xibir Contato");
        opcao[3] = new Opcao("S", "(S)air");

        agenda = new Agenda();
    }
    
    public void exibeMenu(){
    	for (int i = 0; i < opcao.length; i++) {
    		System.out.println(opcao[i].toString());
    	}
    	System.out.print("\nOpção> ");
    	
    }



    public boolean redireciona(){
    	
    	String opcao = s.next();

        switch (opcao){
            case "C":
                int indice;
                System.out.println("\nPosição: ");

                indice = s.nextInt();
                if (!agenda.indiceValido(indice)){
                    System.out.println(invalido);
                    return true;
                }

                System.out.println("\nNome: ");
                String nome = s.next();

                
                System.out.println("Sobrenome: ");
                String sobrenome = s.next();

                System.out.println("Telefone: ");
                String telefone = s.next();

                agenda.cadastraContato(indice, nome, sobrenome, telefone);

                System.out.println("\nCADASTRO REALIZADO!");
                return true;

            case "L":
                String[] str =  agenda.getListaContatos();
                
                for (int i = 0; i < str.length; i++){
                    System.out.print("\n"+str[i]);
                }
                return true;

            case "E":
                System.out.println("\nContato: ");

                indice = s.nextInt();
                if (!agenda.indiceValido(indice)){
                	System.out.println("POSIÇÃO INVÁLIDA!");
                	return true;
                }

                System.out.println(agenda.getContato(indice));
                return true;

            case "S":

                return false;
        }

        return true;


    }

    public boolean eOpcao(String opcao){

        for (int i = 0; i < this.opcao.length; i++){
            if (this.opcao[i].equals(opcao)) return true;
        }

        return false;
    }


}