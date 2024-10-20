package br.com.menu.application;

import br.com.menu.model.Carrinho;
import br.com.menu.model.Pedido;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        // Adicionar produtos ao carrinho
        Pedido p1 = new Pedido(1, "Produto A", 2, new BigDecimal("50.00"));
        Pedido p2 = new Pedido(2, "Produto B", 1, new BigDecimal("100.00"));

        carrinho.adicionarPedido(p1);
        carrinho.adicionarPedido(p2);

        // Exibir o carrinho
        System.out.println("=== Carrinho Atual ===");
        carrinho.exibirCarrinho();
        System.out.println("======================");

        // Finalizar a compra
        System.out.println("\n=== Finalizando a compra ===");
        carrinho.finalizarCompra();
    }
}
