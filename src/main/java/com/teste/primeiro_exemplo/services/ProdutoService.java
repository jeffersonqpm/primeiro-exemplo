package com.teste.primeiro_exemplo.services;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.primeiro_exemplo.model.Produto;
import com.teste.primeiro_exemplo.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    /**
     * Metodo para retornar uma lista de produtos
     * 
     * @return Lista de produtos
     */
    public List<Produto> obterTodos() {

        return produtoRepository.obterTodos();
    }

    public Optional<Produto> obterPorId(int id) {
        return produtoRepository.obterPorId(id);

    }

    public Produto adicionar(Produto produto) {

        // poderia ter uma regra de negocio para validar o produto
        return produtoRepository.adicionar(produto);

    }

    public void deletar(int id){
        // pdoe ter alguma logica de validação antes de delitar ex.: verificar se o usuario tem premissão para deletar
        produtoRepository.deletar(id);

    }

        public Produto atualizar(Integer id, Produto produto) {

            // ter alguma validação do ID
            produto.setId(id);

            return produtoRepository.atualizar(produto);



    }

}

//Jefferson
