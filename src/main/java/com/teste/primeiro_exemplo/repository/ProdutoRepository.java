package com.teste.primeiro_exemplo.repository;

import java.lang.foreign.Linker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.teste.primeiro_exemplo.model.Produto;

@Repository //o spring vai ter controle do repositorio
public class ProdutoRepository {
  //private List<Produto> produtos = new ArrayList<Produto>();
    private List<Produto> produtos = new ArrayList<Produto>();
    private int ultimoId = 0;

    /**
     * Metodo para retornar uma lista de todos os produtos
     * 
     * @return Lista de produtos
     */
    public List<Produto> obterTodos() {

        return produtos;

    }

    /**
     * Metodo que retorna o produto encontrado pelo sei ID
     * 
     * @param id id do produto que será localizado.
     * @return retorna um produto caso seja encontrado
     */
    public Optional<Produto> obterPorId(Integer id) {

        return produtos
                .stream()// filtrar
                .filter(produto -> produto.getId() == id)// pergar da array apenas o produto que tem o ID
                .findFirst(); // pega o primeiro e retorna
    }
/**
 * Metodo para adicionar produto na lista.
 * @param produto produto que será adionado
 * @return retorna o produto que foi adicionado a lista.
 */
    public Produto adicionar(Produto produto) {

        ultimoId++;

        produto.setId(ultimoId);
        produtos.add(produto);

        return produto;
    }

}

    
    // time: 18:46