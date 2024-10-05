import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Compra> compras = new ArrayList<>();
        compras.add(new Compra("Notebook", 2500.00, true));
        compras.add(new Compra("Teclado", 150.00, false));
        compras.add(new Compra("Mouse", 100.00, true));


        Predicate<Compra> filtroCompraPaga = compra -> compra.getIsPago();


        compras.stream()
                .filter(filtroCompraPaga)
                .forEach(System.out::println);


        Notificacao enviarEmail = compra -> System.out.println("Enviando e-mail para a compra: " + compra.getProduto());
        Notificacao enviarSMS = compra -> System.out.println("Enviando SMS para a compra: " + compra.getProduto());

        System.out.println("\nNotificações para compras não pagas:");

        compras.stream()
                .filter(compra -> !compra.getIsPago())  // Compras não pagas
                .forEach(compra -> {
                    enviarEmail.enviar(compra);  // Simulando envio por e-mail
                    enviarSMS.enviar(compra);    // Simulando envio por SMS
                });
    }
}


@FunctionalInterface
interface Notificacao {
    void enviar(Compra compra);
}
