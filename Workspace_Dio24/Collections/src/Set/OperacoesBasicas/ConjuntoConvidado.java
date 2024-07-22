package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    //atributo
    private Set <Convidado> convidadoSet;

    public ConjuntoConvidado(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidadoSet(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));

    }

    public void removerConvidadoPeloCodigoConvite(int codigoConvite){
       Convidado convidadoParaRemover = null;
       for (Convidado c : convidadoSet) {
           if (c.getCodigoConvite() == codigoConvite){
               convidadoParaRemover = c;
               break;
           }
       }
       convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void  exibirConvidados(){
        System.out.println(convidadoSet);
    }
}
