package src;

import java.util.ArrayList;
import java.util.List;


public class Compra {

    public final List<Item> listItens = new ArrayList<>();
    private float valorTotal = 0;

    public Compra(Item item) {
        AdicionarItem(item);
        valorTotal += item.quatidade * item.produto.getPreco();
    }
    public Compra(int quatidade, Produto produto) {
        this(new Item(quatidade, produto));
    }
    public Compra(int quatidade, String nome, float preco)
    {
        this(new Item(quatidade, nome, preco));
    }
    
    public String toString() {
        String lista = "quant.\tnome\t\t\t\tunid.\ttotal";
        
        for(Item item: listItens) {
            lista += String.format(" %dx\t%s\t\t\t\t%.2f\t%.2f", item.quatidade, item.produto.nome, item.produto.getPreco(), valorTotal);
        }
        return lista;
    }
    public void AdicionarItem(Item item) {
        listItens.add(item);
    }
    public float GetValorTotal() {
        return valorTotal;
    }
}
