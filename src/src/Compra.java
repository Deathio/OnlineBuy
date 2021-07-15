package src;

import java.util.ArrayList;
import java.util.List;


public class Compra {

    public final List<Item> listItens;
    private Double valorTotal;

    public Compra() {
        listItens = new ArrayList<>();
        valorTotal = 0.0;
    }
    public Compra(Item item) {
        this();
        AdicionarItem(item);
        valorTotal += item.quatidade * item.produto.getPreco();
    }
    public Compra(int quatidade, Produto produto) {
        this(new Item(quatidade, produto));
    }
    public Compra(int quatidade, String nome, Double preco)
    {
        this(new Item(quatidade, nome, preco));
    }
    
    public String toString() {
        String lista = "quant.\tnome\t\t\t\tunid.\ttotal\n";
        
        for(Item item: listItens) {
            lista += String.format(" %dx\t%s", item.quatidade, item.produto.nome);
            lista += " ".repeat(25) + String.format("%.2f  %.2f\n", item.produto.getPreco(), item.getTotal());
        }
        return lista;
    }
    public void AdicionarItem(Item item) {
        listItens.add(item);
        valorTotal += item.quatidade * item.produto.getPreco();
    }
    public Double GetValorTotal() {
        return valorTotal;
    }
}
