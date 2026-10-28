import java.time.LocalDate;
import java.util.List;

class Pedido {
    private Long id;
    private LocalDate dataPedido;
    private List<Produto> produtos;
    private Cliente cliente;

    public Pedido(Long id, LocalDate dataPedido, List<Produto> produtos, Cliente cliente){
        this.id = id;
        this.dataPedido = dataPedido;
        this.produtos = produtos;
        this.cliente = cliente;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDate getDataPedido() {
        return dataPedido;
    }
    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String toString() {
        return "Pedido: id = " + id + ", dataPedido = " + dataPedido + ", produtos" + produtos + ", cliente = " + cliente;
    }
}
