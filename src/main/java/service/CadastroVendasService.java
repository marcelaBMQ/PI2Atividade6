
package service;

import com.mycompany.persistencia.CadastroVendas;
import com.mycompany.persistencia.CadastroVendasDAO;
import java.util.List;

public class CadastroVendasService {
    
private CadastroVendasDAO cadastroVendasDAO = new CadastroVendasDAO();

    public void cadastrarVenda(CadastroVendas venda) {
        cadastroVendasDAO.cadastrarVenda(venda);
    }

    public void excluirVenda(Integer id) {
        cadastroVendasDAO.excluirVenda(id);
    }

    public List<CadastroVendas> listarTodasVendas() {
        return cadastroVendasDAO.listarTodasVendas();
    }

    public List<CadastroVendas> listarVendaProduto(String produto) {
        return cadastroVendasDAO.listarVendaProd(produto);
    }

    public List<CadastroVendas> listarVendaPlataforma(String plataforma) {
        return cadastroVendasDAO.listarVendaPlat(plataforma);
    }

    public List<CadastroVendas> listarVendaData(String data) {
        return cadastroVendasDAO.listarVendaData(data);
    }
    
    
}
