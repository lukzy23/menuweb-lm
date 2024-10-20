package br.com.menu.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Pedido> pedidos;

    public Carrinho() {
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public void removerPedido(Pedido pedido) {
        this.pedidos.remove(pedido);
    }

    public BigDecimal calcularTotal() {
        return pedidos.stream()
                .map(Pedido::getTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void finalizarCompra() {
        if (pedidos.isEmpty()) {
            System.out.println("Carrinho vazio.");
        } else {
            System.out.println("Compra finalizada. Total: " + calcularTotal());
        }
    }

    public void exibirCarrinho() {
        pedidos.forEach(p ->
                System.out.println("Produto: " + p.getNomeProduto() + " | Quantidade: " + p.getQuantidade() + " | Total: " + p.getTotal())
        );
    }

    // Método para obter a lista de pedidos (Necessário para o CarrinhoService)
    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
