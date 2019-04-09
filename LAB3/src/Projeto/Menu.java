package Projeto;


import java.util.Scanner;

public class Menu {

    Scanner s = new Scanner(System.in);
    private Opcao[] opcao;
    private Agenda agenda;
    private String invalido = "OPÇÃO INVÁLIDA!";


    public Menu(){
        opcao = new Opcao[4];

        opcao[0] = new Opcao("C", "(C)adastrar Contato");
        opcao[1] = new Opcao("L", "(L)istar Contatos");
        opcao[2] = new Opcao("E", "(E)xibir Contato");
        opcao[3] = new Opcao("S", "(S)air");

        agenda = new Agenda();
    }
    
    public boolean eOpcao(String opcao){

        for (int i = 0; i < this.opcao.length; i++){
            if (this.opcao[i].comparador(opcao)) return true;
        }

        return false;
    }

    public void exibeMenu(){
    	for (int i = 0; i < opcao.length; i++) {
    		System.out.println(opcao[i].getComplemento());
    	}
    	System.out.print("\nOpção> ");
    	
    }

    private void iniciaProcessoCadastro(){
    	
    	int indice;
        System.out.print("\nPosição: ");

        indice = s.nextInt();
        if (!agenda.indiceValido(indice)){
            System.out.println(invalido);
            return;
        }

        System.out.print("Nome: ");
        String nome = s.next();
        
        System.out.print("Sobrenome: ");
        String sobrenome = s.next();

        System.out.print("Telefone: ");
        String telefone = s.next();

        agenda.cadastraContato(indice, nome, sobrenome, telefone);

        System.out.println("CADASTRO REALIZADO!\n");
        
    }
    
    private void iniciaProcessoListagem(){
    	
    	String[] str =  agenda.getListaContatos();
        
        for (int i = 0; i < str.length; i++){
            System.out.print("\n"+str[i]);
        }
        System.out.println("\n");
        
    }
    
    private void iniciaProcessoExibeContato(){
    	int indice;
    	System.out.print("Contato> ");

        indice = s.nextInt();
        if (!agenda.indiceValido(indice)){
        	System.out.println("POSIÇÃO INVÁLIDA!");
        	return;
        }

        System.out.println("\n"+agenda.getContato(indice)+"\n");
    }
    
    private void iniciaProcessoFechamento(){
    	s.close();
    }

    public boolean redireciona(){
    	
    	String opcao = s.next();
    	
    	if (!eOpcao(opcao)){
    		System.out.println(invalido+"\n");
    		return true;
    	}

        switch (opcao){
            case "C":
                iniciaProcessoCadastro();
                return true;

            case "L":
                iniciaProcessoListagem();
                return true;

            case "E":
                iniciaProcessoExibeContato();
                return true;

            case "S":
            	iniciaProcessoFechamento();
                return false;
        }

        return true;


    }


}