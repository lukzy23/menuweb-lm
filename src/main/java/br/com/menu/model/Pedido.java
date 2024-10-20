package br.com.menu.model;

import java.math.BigDecimal;

public class Pedido {
    private int idProduto;
    private String nomeProduto;
    private int quantidade;
    private BigDecimal precoUnitario;

    // construtor
    public Pedido(int idProduto, String nomeProduto, int quantidade, BigDecimal precoUnitario) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    // lcds getters e setters
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public BigDecimal getTotal() {
        return precoUnitario.multiply(new BigDecimal(quantidade));
    }
}

