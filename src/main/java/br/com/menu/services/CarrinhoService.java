package br.com.menu.services;

import br.com.menu.model.Carrinho;
import br.com.menu.model.Pedido;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrinhoService {

    private Carrinho carrinho = new Carrinho();

    public void adicionarPedido(Pedido pedido) {
        carrinho.adicionarPedido(pedido);
    }

    public List<Pedido> getPedidos() {
        return carrinho.getPedidos();
    }

    public void finalizarCompra() {
        carrinho.finalizarCompra();
    }
}
