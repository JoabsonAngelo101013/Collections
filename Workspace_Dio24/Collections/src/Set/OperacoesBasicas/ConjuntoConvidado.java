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

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " Dentro do set do Convidados");

        conjuntoConvidado.adicionarConvidadoSet("Convidado 1", 1234);
        conjuntoConvidado.adicionarConvidadoSet("Convidado 2", 1235);
        conjuntoConvidado.adicionarConvidadoSet("Convidado 3", 1235);
        conjuntoConvidado.adicionarConvidadoSet("Convidado 4", 1236);

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " Dentro do set do Convidados");

//        conjuntoConvidado.removerConvidadoPeloCodigoConvite(1235);
//        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " Dentro do set do Convidados");

        conjuntoConvidado.exibirConvidados();
    }
}
