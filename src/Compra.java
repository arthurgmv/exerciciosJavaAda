import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Classe Compra
public class Compra {
    private String produto;
    private Double preco;
    private Boolean isPago;

    // Construtor
    public Compra(String produto, Double preco, Boolean isPago) {
        this.produto = produto;
        this.preco = preco;
        this.isPago = isPago;
    }

    // Getters
    public String getProduto() {
        return produto;
    }

    public Double getPreco() {
        return preco;
    }

    public Boolean getIsPago() {
        return isPago;
    }

    // Método toString para facilitar a visualização das compras
    @Override
    public String toString() {
        return String.format("Produto: %s | Preço: R$ %.2f | Pago: %s",
                produto, preco, isPago ? "Sim" : "Não");
    }

}