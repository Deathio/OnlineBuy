package src;

public class Item {

    public int quatidade;
    public Produto produto;

    public Item(int quatidade, Produto produto) {
        this.quatidade = quatidade;
        this.produto = produto;
    }
    public Item(int quatidade, String nome, float preco, Item item) {
        this(quatidade, new Produto(nome, preco, item));
    }
}
