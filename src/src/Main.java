package src;
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Alberto");

        Compra compra = new Compra(2, "Leite", 10.25);

        System.out.println(compra);
    }
}
