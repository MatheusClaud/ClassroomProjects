package Projeto;

public class Opcao {

    private String identificador;
    private String complemento;

    public Opcao(String identificador, String complemento){
        this.complemento = complemento;
        this.identificador = identificador;
    }
    
    public String getComplemento() {
    	return this.complemento;
    }

    public boolean comparador(Object obj){
        String str = (String) obj;

        return str.equals(identificador);
    }
    
}