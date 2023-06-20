package Repositorio;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Produto;
import modelo.Locacao;
import modelo.Cidade;
import modelo.Endereco;
import modelo.Fornecedor;

public class repositorioCliente {
    public static List<Cliente> clientes = new ArrayList<>();
    public static List<Produto> produtos = new ArrayList<>();
    public static List<Locacao> locacao = new ArrayList<>();
    public static List<Fornecedor> fornecedor = new ArrayList<>();
    
    public static void load() {
        Cidade cidade = new Cidade(1, "São Paulo", "SP");
        Endereco endereco = new Endereco(001, "Avenida Colombo", 3543,"Zona 7", "Via Inox", "87030-120", cidade);
        clientes.add(new Cliente(1, "Marcia Santos", "111.111.111-23", 44, 999669886, endereco));
        
        Cidade cidade2 = new Cidade(1, "São Paulo", "SP");
        Endereco endereco2 = new Endereco(001, "Avenida Colombo", 3543,"Zona 7", "Via Inox", "87030-120", cidade2);
        clientes.add(new Cliente(1, "Marcia Santos", "111.111.111-23", 44, 999669886, endereco2));
        
        Cidade cidade3 = new Cidade(1, "São Paulo", "SP");
        Endereco endereco3 = new Endereco(001, "Avenida Colombo", 3543,"Zona 7", "Via Inox", "87030-120", cidade3);
        clientes.add(new Cliente(1, "Marcia Santos", "111.111.111-23", 44, 999669886, endereco3));
        
        Cidade cidade4 = new Cidade(1, "São Paulo", "SP");
        Endereco endereco4 = new Endereco(001, "Avenida Colombo", 3543,"Zona 7", "Via Inox", "87030-120", cidade4);
        clientes.add(new Cliente(1, "Marcia Santos", "111.111.111-23", 44, 999669886, endereco4));
    }
    
}
