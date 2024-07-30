package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    //atributos

    private Set<Produto> produtoSet;

    public CadastroProduto(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(int cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod,nome,preco,quantidade));
    }

    public Set<Produto> exibirPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
       produtoPorPreco.addAll(produtoSet);
       return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto(9999,"Produto 5", 15d,5);
        cadastroProduto.adicionarProduto(2555,"Produto 0", 20d,2);
        cadastroProduto.adicionarProduto(3333,"Produto 3", 10d,10);
        cadastroProduto.adicionarProduto(99989,"Produto 7", 2d,22);

          System.out.println(cadastroProduto.produtoSet);

          System.out.println(cadastroProduto.exibirPorNome());

          System.out.println(cadastroProduto.exibirPorPreco());
    }
}
