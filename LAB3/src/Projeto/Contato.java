package Projeto;

public class Contato {

    private String nome;
    private String sobrenome;
    private String telefone;
    
    public boolean checarStringValida(String str) {
    	if (str == "") {
    		return false;
    	}
    	
    	for (int i = 0; i < str.length(); i++) {
    		if (str.charAt(i) != ' ') {
    			return true;
    		}
    	}
    	
    	return false;
    }

    public Contato(String nome, String sobrenome, String telefone){
    	
    	if (nome == null || sobrenome == null || telefone == null) {
    		throw new NullPointerException("Parametro nulo em cadastro de notas");
    	}
    	
    	if (!(checarStringValida(nome) && checarStringValida(sobrenome) && checarStringValida(telefone))) {
    		throw new IllegalArgumentException();
    	}
    	
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

    public String getNomeCompleto(){
        return nome + " " + sobrenome;
    }

    @Override
    public boolean equals(Object obj){

        Contato contato = (Contato) obj;

        return contato.getNomeCompleto().equals(getNomeCompleto());
    }

    @Override
    public String toString(){
        return getNomeCompleto() + " - " + telefone;
    }
}