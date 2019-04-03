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



    public boolean redireciona(String opcao){


        switch (opcao){
            case "C":
                int indice;
                System.out.println("\nPosição: ");

                indice = s.nextInt();
                if (!agenda.indiceValido(indice){
                    System.out.println(invalido);
                    return true;
                }

                System.out.println("\nNome: ");
                String nome = s.nextLine();

                System.out.println("\nSobrenome: ");
                String sobrenome = s.nextLine();

                System.out.println("\nTelefone: ");
                String telefone = s.nextLine();

                agenda.cadastraContato(indice, nome, sobrenome, telefone);

                System.out.println("\nCADASTRO REALIZADO");

            case "L":
                String[] str =  agenda.getListaContatos();
                for (int i = 0; i <= str.length; i++){
                    System.out.println("\n"+str[i]);
                }

            case "E":
                System.out.println("\nContato: ");

                indice = s.nextInt();
                if (!agenda.indiceValido(indice){
                System.out.println("POSIÇÃO INVÁLIDA!");
                return true;

                System.out.println(agenda.getContato(indice));
            }

            case "S":

                return false;
        }

        return true;


    }

    public boolean beOption(String opcao){

        for (int i = 0; i < this.opcao.length; i++){
            if (this.opcao[i].equals(opcao)) return true;
        }

        return false;
    }


}
