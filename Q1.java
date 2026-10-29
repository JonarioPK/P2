import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(001, "Ana");
        Cliente c2 = new Cliente(002, "Bruno");

        // Mock de Produtos
        Produto p1 = new Produto(1001, "Caderno", "Papelaria", 20.0);
        Produto p2 = new Produto(1002, "Caneta", "Papelaria", 5.0);
        Produto p3 = new Produto(1003, "The Witcher 3", "Jogo", 250.0);
        Produto p4 = new Produto(1004, "Balatro", "Jogo", 40.0);
        Produto p5 = new Produto(1005, "Rainha Vermelha", "Livro", 50.0);

        List<Produto> todosProdutos = Arrays.asList(p1, p2, p3, p4, p5);

        Pedido ped1 = new Pedido(100, LocalDate.of(2026, 1, 15), List.of(p4, p5), c1);
        Pedido ped2 = new Pedido(101, LocalDate.of(2026, 3, 20), List.of(p1, p3), c2);

        List<Pedido> todosPedidos = Arrays.asList(ped1, ped2);

        System.out.println("Jogos com preço menor que 100.0:");
        todosProdutos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase("Jogo"))
                .filter(p -> p.setPreco() < 100.0)
                .forEach(System.out::println);
    }
}
