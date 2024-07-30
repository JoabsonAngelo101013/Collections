package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutoMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProduto(){
        System.out.println(estoqueProdutoMap);
    }

    public double calculaValorTotalEstoque(){
       double valorTotalEstoque = 0d;
        if (!estoqueProdutoMap.isEmpty()){
            for (Produto p : estoqueProdutoMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;

        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()){
            for (Produto p : estoqueProdutoMap.values()){
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProduto();

        estoque.adicionarProduto(1L, "Produto 1", 10, 5d);
        estoque.adicionarProduto(2L, "Produto 2", 5, 10d);
        estoque.adicionarProduto(3L, "Produto 3", 2, 15d);

        estoque.exibirProduto();

        System.out.println();

        System.out.println("Valor total do estoque: R$ " + estoque.calculaValorTotalEstoque());
        System.out.println();

        System.out.println("Produto mais caro: R$ " + estoque.obterProdutoMaisCaro());
    }

}
