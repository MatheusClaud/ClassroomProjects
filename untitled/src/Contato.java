public class Contato {

    private String nome;
    private String sobrenome;
    private String telefone;
    private boolean ativo = false;

    public Contato(String nome, String sobrenome, String telefone){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.ativo = true;
    }

    public boolean contatoAtivo(){
        return ativo;
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
