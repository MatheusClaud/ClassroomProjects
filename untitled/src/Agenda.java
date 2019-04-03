import java.util.Arrays;

public class Agenda {

    private Contato[] contatos = new Contato[101];

    public void cadastraContato(int indice, String nome, String sobrenome, String telefone){
        contatos[indice] = new Contato(nome, sobrenome, telefone);

    }

    public String[] getListaContatos(){

        String[] str = new String[100];
        int indice = 0;
        for (int i = 1; i <= contatos.length; i++){
            if (contatos[i].contatoAtivo()){
                str[indice] = i + " - " + contatos[i].getNomeCompleto();
                indice++;
            }
        }

        str = Arrays.copyOf(str, indice);

        return str;
    }

    public String getContato(int indice){
        return contatos[indice].toString();
    }

    public boolean indiceValido(int indice){
        return (indice >= 1 && indice <= 100);
    }


}
