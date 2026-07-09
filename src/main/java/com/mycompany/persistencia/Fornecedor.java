
package com.mycompany.persistencia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="fornecedor")
public class Fornecedor {
    
    @Column(name="NomeFornecedor")
    private String nomeFornecedor;
    
     @Column(name="Telefone")
    private String telefone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
     @Column(name="idFornecedor")
    private int id;
    
     public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public Fornecedor(){}
    
    public Fornecedor ( String nomeFornecedor, String telefone){
        this.nomeFornecedor = nomeFornecedor;
        this.telefone = telefone;
    }
    
    public Fornecedor ( int id, String nomeFornecedor, String telefone){
        this.id = id;
        this.nomeFornecedor = nomeFornecedor;
        this.telefone = telefone;
    }
    
}
