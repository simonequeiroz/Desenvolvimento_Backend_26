package com.senai.aula07api.controller;

import org.springframework.web.bind.annotation.*; // * permite importar todos os metodos http
import org.springframework.web.bind.annotation.RestController;
import com.senai.aula07api.models.*;
import  java.util.ArrayList;
import  java.util.List;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController // RestController é um metodo que indica que a classe ira receber requisições http

// Rota produtos
@RequestMapping("/produtos") 
public class ProdutoControllers {

    // Lista que simula um banco de dados

    private List<Produto> produtos = new ArrayList<>();


    // Cria um construtor para produtocontrollers

    public ProdutoControllers(){
        produtos.add(new Produto("Notebook", 3500));

        produtos.add(new Produto("Mouse", 100));

        produtos.add(new Produto("Teclado", 250));

    }


    //==============
    // Cria metodo get para listar todos os produtos
    // ==============

    @GetMapping 
    public List<Produto> listarProdutos(){
        return produtos;
    }


    //======
    // Cria metodo get para listar os produtos por id
    //====
    @GetMapping("/{id}") // {id} indica que o id sera passado na URL

    public Produto buscarProduto(@PathVariable int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }

        return null;
    }



    //=============
    // PostMapping
    @PostMapping
    public Produto cadastrarProduto(@RequestBody Produto produto) {
        Produto novoProduto = new Produto(produto.getNome(), produto.getPreco());
        produtos.add(novoProduto);
        return novoProduto;



    }

    //=========
    // PUT - Atualizar Produto

    @PutMapping("/{id}") // {id} indica que o id sera passado na URL
    public Produto atualizarProduto(@PathVariable int id, @RequestBody Produto produtoAtualizado) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produto.setNome(produtoAtualizado.getNome());
                produto.setPreco(produtoAtualizado.getPreco());
                return produto;
            }
        }

        return null;
    }

    //==============
    // Delete excluir produto pelo id

    @DeleteMapping("/{id}") // {id} indica que o id sera passado na URL
    public String excluirProduto(@PathVariable int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produtos.remove(produto);
                return "Produto removido com sucesso!";
            }
        }

        return "Produto nao encontrado.";
    }
}
