 
package com.mycompany.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

 
public class CadastroVendasDAO {
    
    public void cadastrarVenda(CadastroVendas  v) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(v);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEtityManager();
        }
    }
    
    
    public List<CadastroVendas> listarVendaProd(String filtroVendaProd) {
        EntityManager em = JPAUtil.getEntityManager(); //Abrir conexao
        List<CadastroVendas> cadVendaProd;
        
        try {
            //pesquisa, consulta JPQL
            String textoQuery = "select v from CadastroVendas v "
                    + " WHERE (:filtroVendaP IS NULL OR v.produto  LIKE :filtroVendaP)";
            Query consulta = em.createQuery(textoQuery); //implementação da consulta
            consulta.setParameter("filtroVendaP", filtroVendaProd.isEmpty() ? null : "%" + filtroVendaProd + "%");

            cadVendaProd = consulta.getResultList(); //executa consulta e obtem lista

        } finally {
            JPAUtil.closeEtityManager(); //finalização
        }
        return cadVendaProd; //lista de produtos encontradas
    }
    
    
    
    public List<CadastroVendas> listarVendaData(String filtroVendaData) {
        EntityManager em = JPAUtil.getEntityManager(); //Abrir conexao
        List<CadastroVendas> cadVendaData = new ArrayList<>() ;
        
        try {
            //pesquisa, consulta JPQL
            String textoQuery = "select v from CadastroVendas v "
                   // + " WHERE (:filtroVendaData IS NULL OR d.CadastroVendas  LIKE :filtroVendaData)";
            + " WHERE (:filtroVendaD IS NULL OR v.data = :filtroVendaD)";
            Query consulta = em.createQuery(textoQuery); //implementação da consulta
          //  consulta.setParameter("filtroVendaD", filtroVendaData.isEmpty() ? null : "%" + filtroVendaData + "%");

           if (filtroVendaData == null || filtroVendaData.isBlank()) {
            consulta.setParameter("filtroVendaD", null);
        } else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.parse(filtroVendaData, formatter);
            consulta.setParameter("filtroVendaD", data);
        }
          
            cadVendaData = consulta.getResultList(); //executa consulta e obtem lista

        } finally {
            JPAUtil.closeEtityManager(); //finalização
        }
        return cadVendaData; //lista de produtos encontradas
    }
    
    
    
    public List<CadastroVendas> listarVendaPlat(String filtroVendaPlat) {
        EntityManager em = JPAUtil.getEntityManager(); //Abrir conexao
        List<CadastroVendas> cadVendaPlat = new ArrayList<>() ;
        
        try {
            //pesquisa, consulta JPQL
            String textoQuery = "select t from CadastroVendas t "
                    + " WHERE (:filtroVendaP IS NULL OR t.plataforma  LIKE :filtroVendaP)";
            Query consulta = em.createQuery(textoQuery); //implementação da consulta
            consulta.setParameter("filtroVendaP", filtroVendaPlat.isEmpty() ? null : "%" + filtroVendaPlat + "%");

            cadVendaPlat = consulta.getResultList(); //executa consulta e obtem lista

        } finally {
            JPAUtil.closeEtityManager(); //finalização
        }
        return cadVendaPlat; //lista de produtos encontradas
    }
    
    public List<CadastroVendas> listarTodasVendas() {
    EntityManager em = JPAUtil.getEntityManager();

    try {
        String textoQuery = "select v from CadastroVendas v order by v.data desc";
        Query consulta = em.createQuery(textoQuery);
        return consulta.getResultList();
    } finally {
        JPAUtil.closeEtityManager();
    }
}
    
    
    public void excluirVenda(int id) {
        EntityManager em = JPAUtil.getEntityManager(); //Abertura de conexao
        try {
            CadastroVendas v = em.find(CadastroVendas.class, id); //busca pelo id do produto informado
            if (v != null) {
                em.getTransaction().begin(); //iniciamos transaçao
                em.remove(v); //removemos a despesa selecionada
                em.getTransaction().commit(); //confirmação
            }
        } catch (Exception e) {
            em.getTransaction().rollback(); //desfazer em caso de erro
            throw e;
        } finally {
            JPAUtil.closeEtityManager(); //fechamos a conexao
        }
    }
    
    
    
//    public CadastroVendas obterVenda(int id) {
//        EntityManager em = JPAUtil.getEntityManager();
//        try {
//            return em.find(CadastroVendas.class, id);
//        } finally {
//            JPAUtil.closeEtityManager();
//        }
//    }
//    

//    public List<CadastroVendas> listarVendaPlat(JTextField txtPlataforma) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
}
