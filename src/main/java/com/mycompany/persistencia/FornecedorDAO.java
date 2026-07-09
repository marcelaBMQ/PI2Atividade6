 
package com.mycompany.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

 
public class FornecedorDAO {
    
    public void cadastrarForn(Fornecedor f) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(f);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEtityManager();
        }
    }
    
    
    public List<Fornecedor> listarForn(String filtroFornecedor) {
        EntityManager em = JPAUtil.getEntityManager(); //Abrir conexao
        List<Fornecedor> forn = new ArrayList<>();
        
        try {
            //pesquisa, consulta JPQL
            String textoQuery = "select f FROM Fornecedor f "
                    + " WHERE (:filtroForn IS NULL OR f.nomeFornecedor  LIKE :filtroForn)";
            Query consulta = em.createQuery(textoQuery); //implementação da consulta
            consulta.setParameter("filtroForn", filtroFornecedor.isEmpty() ? null : "%" + filtroFornecedor + "%");

            forn = consulta.getResultList(); //executa consulta e obtem lista

        } finally {
            JPAUtil.closeEtityManager(); //finalização
        }
        return forn; //lista de produtos encontradas
    }
    
    public void excluirForn(int id) {
        EntityManager em = JPAUtil.getEntityManager(); //Abertura de conexao
        try {
            Fornecedor f = em.find(Fornecedor.class, id); //busca pelo id do produto informado
            if (f != null) {
                em.getTransaction().begin(); //iniciamos transaçao
                em.remove(f); //removemos a despesa selecionada
                em.getTransaction().commit(); //confirmação
            }
        } catch (Exception e) {
            em.getTransaction().rollback(); //desfazer em caso de erro
            throw e;
        } finally {
            JPAUtil.closeEtityManager(); //fechamos a conexao
        }
    }
    
//    public Fornecedor obterForn(int id) {
//        EntityManager em = JPAUtil.getEntityManager();
//        try {
//            return em.find(Fornecedor.class, id);
//        } finally {
//            JPAUtil.closeEtityManager();
//        }
//    }
    
    
}
