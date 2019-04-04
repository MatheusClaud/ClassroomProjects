package Projeto;

public class Opcao {

    private String identificador;
    private String complemento;

    public Opcao(String identificador, String complemento){
        this.complemento = complemento;
        this.identificador = identificador;
    }
    
    @Override
    public String toString() {
    	return this.complemento;
    }

    @Override
    public boolean equals(Object obj){
        String str = (String) obj;

        return str == identificador;
    }
    
}