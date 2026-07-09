
package com.mycompany.persistencia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;


@Entity
@Table(name="vendas")
public class CadastroVendas {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idVendas")
   private int id;
    
    
   @Column(name="Data") 
   private LocalDate data;
   @Column(name="Plataforma")
   private String plataforma;
   @Column(name="Produto")
   private String produto;
   @Column(name="Valor")
   private double valor;

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
   
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public CadastroVendas(){
    }
    
    public CadastroVendas( String produto, LocalDate data,  double valor, String plataforma){
        this.produto = produto;
        this.data = data;
        this.valor = valor;
        this.plataforma = plataforma; 
        
    }
    
    public CadastroVendas( int id, LocalDate data, String plataforma, String produto, double valor){
        this.id = id;
        this.data = data;
        this.plataforma = plataforma;
        this.produto = produto;
        this.valor = valor;
    }
    
    
}
