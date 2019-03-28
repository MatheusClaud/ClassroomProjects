public class Disciplina {

    String nome;
    int horas = 0;
    int[] notas = {0, 0, 0, 0};

    public Disciplina(String nome){
        this.nome = nome;
    }

    public void cadastrarHoras(int valor){
        this.horas += valor;
    }

    public void cadastrarNotas(int indice, int valor){
        this.notas[indice] = valor;
    }

    public double getAvarage(){
        double total = 0;

        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }

        total /= notas.length;

        return total;
    }

    public boolean aprovado(){

        double total = getAvarage();

        if (total >= 7){
            return true;
        }

        return false;
    }

    public String getNotas(){

        String saida = "[";

        for (int i = 0; i < notas.length; i++){
            saida = saida + notas[i];

            if (i+1 != notas.length){
                saida += ", ";
            }
        }

        saida += "]";

        return saida;
    }

    @Override
    public String toString(){
        return nome + " 4 " +  getAvarage() + " " + getNotas();
    }









}
