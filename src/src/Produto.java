package src;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    
    private float preco;
    public String nome;
    public final List<Item> itens = new ArrayList<>();

    Produto(String nome, float preco, Item item) {
        this.nome = nome;
        this.preco = preco;
        itens.add(item);
    }

    public float getPreco() {
        return preco;
    }
}
