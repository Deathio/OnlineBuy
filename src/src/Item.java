package src;

public class Item {

    public int quatidade;
    public Produto produto;

    public Item(int quatidade, Produto produto) {
        this.quatidade = quatidade;
        this.produto = produto;
    }
    public Item(int quatidade, String nome, Double preco) {
        this.quatidade = quatidade;
        this.produto = new Produto(nome, preco, this);
    }

    public double getTotal() {
        return quatidade * produto.getPreco();
    }
}
