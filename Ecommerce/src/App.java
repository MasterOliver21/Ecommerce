public class App {
    public static void main(String[] args) throws Exception {
        
        Carrinho c = new Carrinho();
        Pedido p1 = new Pedido(new Computador("Predator", 7000.37), 3);
        Pedido p2 = new Pedido(new Televisao("LG 50p", 3000.11), 2);

        c.addPedido(p1);
        c.addPedido(p2);

        System.out.println(c.totalCarrinho());
    }
}
