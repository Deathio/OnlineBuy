package src;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    
    private Double preco;
    public String nome;
    public final List<Item> itens = new ArrayList<>();

    Produto(String nome, Double preco2, Item item) {
        this.nome = nome;
        this.preco = preco2;
        itens.add(item);
    }

    public Double getPreco() {
        return preco;
    }
}
