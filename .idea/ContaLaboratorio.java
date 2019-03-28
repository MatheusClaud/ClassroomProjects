public class ContaLaboratorio {

    String nome;
    int espacoOucupado = 0;
    int limite = 2000;

    public ContaLaboratorio(String nome){
        this.nome = nome;
    }

    public void consomeEspaco(int espacoOucupado){
        this.espacoOucupado += espacoOucupado;
    }

    public void liberaEspaco(int quantidade){
        this.espacoOucupado -= quantidade;
    }

    public boolean atingiuCota(){
        if (limite == espacoOucupado){
            return true;
        }

        return  false;
    }

    @Override
    public String toString(){
        return nome + " " + espacoOucupado + " / " + limite;
    }


}
