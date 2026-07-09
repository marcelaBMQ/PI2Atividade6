
package com.mycompany.persistencia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="produto")
public class Produto {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    private String nomeProduto;
     @Column(name="Fabricante")
    private String fabricante;
      @Column(name="Fornecedor")
    private String fornecedor;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="idProduto")
    private int id;
    

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

   
    
    public Produto(){
    }
    
//    public Produto (String nomeProduto,
//     String fabricante, String fornecedor){
//        this.nomeProduto = nomeProduto;
//        this.fabricante = fabricante;
//        this.fornecedor = fornecedor;
//        
//    }
    
    public Produto (int id, String nomeProduto,
     String fabricante, String fornecedor){
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.fabricante = fabricante;
        this.fornecedor = fornecedor;
        
    }

//    public Object getId() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    
    
}
