
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import service.ProdutoService;
/**
 *
 * @author RAUL
 */
public class ProdutoServiceTest {
    
      @Test
    public void deveAceitarNomeValido() {

        ProdutoService service = new ProdutoService();

        boolean resultado =
                service.nomeProdutoValido("Notebook");

        assertTrue(resultado);

    }
    
}
