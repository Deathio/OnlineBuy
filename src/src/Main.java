package src;
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Alberto");

        Compra compra1 = new Compra();
        Item item1 = new Item(2, "Leite", 10.25);
        Item item2 = new Item(1, "PC GAMER", 5234.43);

        cliente.AdicionarCompras(compra1);
        
        compra1.AdicionarItem(item1);
        compra1.AdicionarItem(item2);

        cliente.AdicionarCompras(new Compra(10, "Macarrão", 5.25));

        System.out.println(cliente);
    }
}
