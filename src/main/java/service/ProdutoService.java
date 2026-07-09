package service;

import com.mycompany.persistencia.Produto;
import com.mycompany.persistencia.ProdutoDAO;


public class ProdutoService {

    public void cadastrarProduto(Produto produto) {

        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.cadastrarProd(produto);

    }

}