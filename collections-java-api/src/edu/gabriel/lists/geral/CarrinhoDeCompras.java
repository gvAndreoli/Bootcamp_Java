package edu.gabriel.lists.geral;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> compras;

    public CarrinhoDeCompras() {
        this.compras = new ArrayList<>();
    }

    public void addItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        compras.add(item);
    }

    public void removerItem(String nome){
        List<Item> listaParaRemover = new ArrayList<>();
        for(Item i: compras){
            if (nome.equals(i.getNome())){
                listaParaRemover.add(i);
            }
        }
        compras.removeAll(listaParaRemover);
    }

    public double calcularValorTotal(){
        double resultado = 0;
        for (Item i: compras){
            resultado += (i.getPreco() * i.getQuantidade());
        }
        return resultado;
    }

    public void exibirItens(){
        System.out.println(compras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.addItem("coca", 7, 2);
        carrinho.addItem("Carne", 30, 1);

        System.out.println("Valor total: "+ carrinho.calcularValorTotal());

        carrinho.removerItem("Carne");
        System.out.println("Valor total: "+ carrinho.calcularValorTotal());

    }
}
