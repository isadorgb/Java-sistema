package Repositorio;

import java.util.ArrayList;
import java.util.List;
import modelo.Cidade;
import modelo.Endereco;
import modelo.Fornecedor;

public class repositorioFornecedor {
    
    public static List<Fornecedor> fornecedor = new ArrayList<>();
    
    public static void load() {
        Cidade cidade = new Cidade(1, "São Paulo", "SP");
        Endereco endereco = new Endereco(001, "Avenida Colombo", 3543,"Zona 7", "Via Inox", "87030-120", cidade);
        Fornecedor fornecedor = new Fornecedor(1, "Empresa ABC", "123456789", 44, 12345678, endereco);      
  }
    
}
