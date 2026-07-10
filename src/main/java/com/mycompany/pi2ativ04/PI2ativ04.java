

package com.mycompany.pi2ativ04;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import model.Produto;
import service.ProdutoService;

public class PI2ativ04 {

    
    public static void main(String[] args) {
         ProdutoService service = new ProdutoService();

        Produto p = new Produto();

        p.setNomeProduto("Teste");
        p.setFabricante("Samsung");
        p.setFornecedor("Fornecedor Teste");

        service.cadastrarProduto(p);

        System.out.println("Cadastro realizado com sucesso.");

        service.listarProdutos()
                .forEach(prod ->
                        System.out.println(prod.getNomeProduto()));
     
    }
}
