package src;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public String nome;
    public final List<Compra> listaDeCompras = new ArrayList<>();

    // Constructs
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
    public Cliente(String nome, int quatidade, String nomeProduto, Double preco) {
        this(nome, new Item(quatidade, nomeProduto, preco));
    }

    // functions
    public String toString() {
        String printState = String.format("Nome: %s\n", nome);
        int compras = 1;
        for(Compra compra: listaDeCompras) {
            printState += "-".repeat(22) + String.format(" Compra %d ", compras++) + "-".repeat(22);
            printState += "\n" + compra.toString() + "\n";
        }
        return printState;
    }
    public void AdicionarCompras(Compra compra) {
        listaDeCompras.add(compra);
    }
}
