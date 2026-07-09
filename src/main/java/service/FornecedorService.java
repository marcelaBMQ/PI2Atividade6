package service;

import model.Fornecedor;
import com.mycompany.persistencia.FornecedorDAO;
import java.util.List;


public class FornecedorService {
    
    private FornecedorDAO fornecedorDAO = new FornecedorDAO();

    public void cadastrarFornecedor(Fornecedor fornecedor) {
        fornecedorDAO.cadastrarForn(fornecedor);
    }

    public List<Fornecedor> listarFornecedores() {
        return fornecedorDAO.listarForn("");
    }

    public List<Fornecedor> buscarFornecedores(String filtro) {
        return fornecedorDAO.listarForn(filtro);
    }

    public void excluirFornecedor(Integer id) {
        fornecedorDAO.excluirForn(id);
    }
    
    
}
