package com.teste.primeiro_exemplo.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.teste.primeiro_exemplo.model.Produto;

@Repository
public class ProdutoRepository {

    private List<Produto> produtos = new ArrayList<Produto>();
    private int ultimoId = 0;

    // retorna uma lista de produtos

    // Metodo para retornar uma lista de produtos
    public List<Produto> obterTodos() {

        return produtos;

    }

}

    public Produto obterPorId(Integer id) {

        return produtos
                .stream()
                .filter(produto -> produto.getId() == id)
                .findFirst();
    }

