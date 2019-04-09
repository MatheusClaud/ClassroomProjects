package Projeto;


public class Agenda {

    private Contato[] contatos;
    private int contatosCriados;

    public Agenda() {
    	contatosCriados = 0;
    	contatos = new Contato[101];
    }
    public void cadastraContato(int indice, String nome, String sobrenome, String telefone){
    	
        contatos[indice] = new Contato(nome, sobrenome, telefone);
        contatosCriados++;

    }
    
    public Contato getContatos(int  indice) {
    	return contatos[indice];
    }

    public String[] getListaContatos(){

    	
    	if (contatosCriados == 0) { 
    		String[] str = {""};
    		return str;
    	}
    	
    	String[] str = new String[contatosCriados];
    	
    	int indice = 0;
        for (int i = 1; i < contatos.length; i++){
        	if (contatos[i] != null){
            	str[indice] = i + " - " + contatos[i].getNomeCompleto();
            	++indice;
            }
        }

        return str;
    }

    public String getContato(int indice){
        return contatos[indice].toString();
    }

    public boolean indiceValido(int indice){
        return (indice >= 1 && indice <= 100);
    }
    
    @Override
    public boolean equals(Object obg) {
    	Agenda agenda = (Agenda) obg;
    	
    	
    	for (int i = 1; i < agenda.contatos.length; i++) {
    		if (agenda.contatos[i] == null || this.contatos[i] == null) {
    			if (!(agenda.contatos[i] == null && this.contatos[i] == null)) return false ;
    		}
    		else if(!agenda.contatos[i].equals(this.contatos[i])) return false;
    	}
    	
    	return true;
    	
    }


}