package dao;

import domain.Cliente;

import java.util.*;

public class ClienteMapDAO implements IClienteDAO{
    Map<Long, Cliente> map;

    public ClienteMapDAO() {
        this.map = new TreeMap<>();
    }


    public Boolean cadastrar(Cliente cliente) {
        if(this.map.containsKey(cliente.getCpf())){
            return false;
        }

        this.map.put(cliente.getCpf(), cliente);
        return true;
    }

    public void excluir(Long cpf) {
        this.map.remove(cpf);
    }

    public void alterar(Long cpf, Cliente cliente) {
        if(this.map.containsKey(cpf)){
           Cliente clienteAtualizar = this.map.get(cpf);
           clienteAtualizar.setNome(cliente.getNome());
           clienteAtualizar.setTel(cliente.getTel());
           clienteAtualizar.setEndereco(cliente.getEndereco());
           clienteAtualizar.setNumero(cliente.getNumero());
           clienteAtualizar.setCidade(cliente.getCidade());
           clienteAtualizar.setEstado(cliente.getEstado());
        }
    }

    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }

    public Collection<Cliente> buscarTodos() {
        return map.values();
    }


    public String toString() {
        return "ClienteMapDAO{" +
                "map=" + map +
                '}';
    }
}
