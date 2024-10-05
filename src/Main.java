import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Lista de compras
        List<Compra> compras = new ArrayList<>();
        compras.add(new Compra("Notebook", 2500.00, true));
        compras.add(new Compra("Teclado", 150.00, false));
        compras.add(new Compra("Mouse", 100.00, true));

        // Interface funcional para filtrar compras pagas
        Predicate<Compra> filtroCompraPaga = compra -> compra.getIsPago();

        // Filtrando as compras pagas
        compras.stream()
                .filter(filtroCompraPaga)
                .forEach(System.out::println);
    }
}
