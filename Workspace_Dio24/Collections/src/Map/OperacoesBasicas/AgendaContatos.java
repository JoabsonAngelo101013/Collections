package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();

    }

    public void adicionarContato(String nome,Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public  void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 111111111);
        agendaContatos.adicionarContato("Camila dio", 6543211);
        agendaContatos.adicionarContato("Maria Silva", 111111111);
        agendaContatos.adicionarContato("Camila", 444444);

        System.out.println();
        agendaContatos.exibirContatos();

        System.out.println();

        agendaContatos.removerContato("Maria Silva");
        System.out.println();
        agendaContatos.exibirContatos();


        System.out.println();

        System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Camila dio"));
    }
}
