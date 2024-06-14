package Collections.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Integer, Produto> estoqueProdutoMap;
    private Object adicionarProduto;


    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<Integer, Produto>();
    }

    public void adicionarProduto(int codigo, String nome, int  quantidade, double preco) {
        estoqueProdutoMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutoMap);
    }

    public double calcularEstoqueTotal() {
        double estoqueTotal = 0;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                estoqueTotal += p.getQuantidade() * p.getPreco();
            }
        }
        return estoqueTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()){
                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(123456789, "Coca-Cola", 10, 3.50);
        estoque.adicionarProduto(987654321, "Pepsi", 10, 5.50);
        estoque.adicionarProduto(456789123, "Fanta", 10, 4.0);
        estoque.adicionarProduto(345678912, "Kuat", 10, 9.0);
        estoque.adicionarProduto(234567891, "Mineirinho", 10, 2.50);


        estoque.exibirProdutos();
        System.out.println("O estoque total é: " + estoque.calcularEstoqueTotal());
        System.out.println("O produto mais caro é: " + estoque.obterProdutoMaisCaro());

    }



}
