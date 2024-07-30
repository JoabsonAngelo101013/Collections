package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo

    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone){
        contatoSet.add(new Contato(nome, telefone));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorContato(String nome){
        Set<Contato>contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }


    public Contato atualizarTelefoneContato(String nome, int novoTelefone){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setTelefone(novoTelefone);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 54321);
        agendaContatos.adicionarContato("Camila Cavalcante", 111111);
        agendaContatos.adicionarContato("Camila DIO", 654321);
        agendaContatos.adicionarContato("Maria Camila", 111111);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorContato("Maria Camila"));

        System.out.println("Contato Atualizado: " + agendaContatos.atualizarTelefoneContato("Maria Camila", 5555555));

        agendaContatos.exibirContato();
    }


}
