package src;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public String nome;
    public final List<Compra> listaDeCompras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }
    public Cliente(String nome, Compra compra) {
        this(nome);
        AdicionarCompras(compra);
    }
    public Cliente(String nome, Item item) {
        this(nome, new Compra(item));
    }
    public Cliente(String nome, int quatidade, Produto produto) {
        this(nome, new Item(quatidade, produto));
    }
    public Cliente(String nomeCliente, int quatidade, String nome, float preco)
    {
        this(nomeCliente, new Item(quatidade, nome, preco));
    }

    public String toString() {

        return "";
    }
    public void AdicionarCompras(Compra compra) {
        listaDeCompras.add(compra);
    }
}
