package service;

import model.Produto;
import com.mycompany.persistencia.ProdutoDAO;
import java.util.List;


public class ProdutoService {
    
     ProdutoDAO produtoDAO = new ProdutoDAO();

    public void cadastrarProduto(Produto produto) {
             produtoDAO.cadastrarProd(produto);
    }

    public List<Produto> listarProdutos() {
        return produtoDAO.listarProd("");
    }
    
    public void excluirProduto(Integer id) {
         produtoDAO.excluirProd(id);
    }
    
    public List<Produto> buscarProdutos(String filtro) {
       return produtoDAO.listarProd(filtro);
    }
    
}