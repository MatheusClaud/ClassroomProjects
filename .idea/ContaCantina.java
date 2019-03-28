public class ContaCantina {

    String nome;
    int debito;
    int quantidade = 0;
    int gastosTotais = 0;

    public ContaCantina(String nome){
        this.nome = nome;
    }

    public void cadastraLanche(int quantidade, int valor){
        debito += valor;
        this.quantidade += quantidade;
        this.gastosTotais += valor;
    }

    public void pagaConta(int valor){
        debito += valor;
    }

    public int getFaltaPagar(){
        return  debito;
    }

    @Override
    public String toString(){
        return nome + " " + quantidade + " " + gastosTotais;
    }
}
