package br.com.menu.controller;

import br.com.menu.model.Pedido;
import br.com.menu.services.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

    @Autowired
    private CarrinhoService carrinhoService;

    @PostMapping("/adicionar")
    public void adicionarPedido(@RequestBody Pedido pedido) {
        carrinhoService.adicionarPedido(pedido);
    }

    @GetMapping("/exibir")
    public List<Pedido> exibirCarrinho() {
        return carrinhoService.getPedidos();
    }

    @PostMapping("/finalizar")
    public String finalizarCompra() {
        carrinhoService.finalizarCompra();
        return "Compra finalizada!";
    }
}
