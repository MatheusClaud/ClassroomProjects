package Projeto;


public class Agenda {

    private Contato[] contatos = new Contato[101];
    private int contatosCriados = 0;

    public void cadastraContato(int indice, String nome, String sobrenome, String telefone){
        contatos[indice] = new Contato(nome, sobrenome, telefone);
        contatosCriados++;

    }

    public String[] getListaContatos(){

    	
    	if (contatosCriados == 0) { 
    		String[] str = {" "};
    		return str;
    	}
    	
    	String[] str = new String[contatosCriados];
    	
    	int indice = 0;
        for (int i = 1; i <= contatos.length; i++){
            if (!contatos[i].contatoVazio()){
            	str[indice] = i + " - " + contatos[i].getNomeCompleto();
            	indice++;
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


}