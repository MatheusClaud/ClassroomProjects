package Projeto;

public class Contato {

    private String nome;
    private String sobrenome;
    private String telefone;
    private boolean vazio = true;

    public Contato(String nome, String sobrenome, String telefone){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.vazio = false;
    }

    public boolean contatoVazio(){
        return vazio;
    }

    public String getNomeCompleto(){
        return nome + " " + sobrenome;
    }

    @Override
    public boolean equals(Object obj){

        Contato contato = (Contato) obj;

        return getNomeCompleto() == contato.getNomeCompleto();
    }

    @Override
    public String toString(){
        return getNomeCompleto() + " - " + telefone;
    }
}