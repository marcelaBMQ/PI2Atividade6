
package com.mycompany.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;


public class ProdutoDAO {
    
    public void cadastrarProd(Produto p) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEtityManager();
        }
    }
    
    
    public List<Produto> listarProd(String filtroNomeProd) {
        EntityManager em = JPAUtil.getEntityManager();
          List<Produto> prod = new ArrayList<>();

       try {
           String textoQuery = "select p from Produto p "
                    + " WHERE (:produtoFiltro IS NULL OR p.nomeProduto LIKE :produtoFiltro)";
            Query consulta = em.createQuery(textoQuery); //implementação da consulta
            consulta.setParameter("produtoFiltro", filtroNomeProd.isEmpty() ? null : "%" + filtroNomeProd+ "%");

             prod = consulta.getResultList(); //executa consulta e obtem lista

        } finally {
            JPAUtil.closeEtityManager(); //finalização
        }
        return prod; //lista de despesas encontradas
    
}
    
    public void excluirProd(int id) {
        EntityManager em = JPAUtil.getEntityManager(); //Abertura de conexao
        try {
            Produto p = em.find(Produto.class, id); //busca pelo id do produto informado
            if (p != null) {
                em.getTransaction().begin(); //iniciamos transaçao
                em.remove(p); //removemos a despesa selecionada
                em.getTransaction().commit(); //confirmação
            }
        } catch (Exception e) {
            em.getTransaction().rollback(); //desfazer em caso de erro
            throw e;
        } finally {
            JPAUtil.closeEtityManager(); //fechamos a conexao
        }
    }
    
    
}
