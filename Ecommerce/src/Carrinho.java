import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Pedido> pedidos = new ArrayList();

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);

    }

    public double totalCarrinho() {
        double total = 0;
        for (Pedido p : pedidos) {
            double valorPedido = p.produto.getPreco() * p.quantidade;
            total += valorPedido;
        }
        return total;

    }

    public List<Pedido> listaPedido() {
        return pedidos;
    }

    public boolean checkOut(double valorPago) {
        if (valorPago >= totalCarrinho()) {
            pedidos.clear();
            return true;
        } else
            return false;

    }

}
