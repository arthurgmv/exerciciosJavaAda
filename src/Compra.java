
public class Compra {
    private String produto;
    private Double preco;
    private Boolean isPago;


    public Compra(String produto, Double preco, Boolean isPago) {
        this.produto = produto;
        this.preco = preco;
        this.isPago = isPago;
    }

    public String getProduto() {
        return produto;
    }

    public Double getPreco() {
        return preco;
    }

    public Boolean getIsPago() {
        return isPago;
    }


    @Override
    public String toString() {
        return String.format("Produto: %s | Preço: R$ %.2f | Pago: %s",
                produto, preco, isPago ? "Sim" : "Não");
    }

}