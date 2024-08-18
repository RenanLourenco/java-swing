package dao;

import domain.Cliente;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClienteSetDAO implements IClienteDAO{
    private Set<Cliente> set;

    public ClienteSetDAO(){
        this.set = new HashSet<>();
    }

    public Boolean cadastrar(Cliente cliente) {
        if(this.set.contains(cliente)){
            return false;
        }

        this.set.add(cliente);
        return true;
    }

    public void excluir(Long cpf) {
        Cliente encontrado = null;
        for(Cliente cliente : this.set) {
            if(cliente.getCpf() == cpf){
                encontrado = cliente;
                break;
            }
        }
        if(encontrado != null) {
            this.set.remove(encontrado);
        }
    }

    public void alterar(Long cpf, Cliente cliente) {
        Cliente c = null;
        for(Cliente cl : this.set){
            if(cl.getCpf() == cpf){
                c = cl;
                break;
            }
        }
        if(c != null){
            c.setCpf(cliente.getCpf());
            c.setCidade(cliente.getCidade());
            c.setEndereco(cliente.getEndereco());
            c.setEstado(cliente.getEstado());
            c.setNumero(cliente.getNumero());
            c.setTel(cliente.getTel());
            c.setNome(cliente.getNome());

        }
    }

    public Cliente consultar(Long cpf) {
        for(Cliente cl : this.set){
            if(cl.getCpf() == cpf){
                return cl;
            }
        }
        return null;
    }

    public Collection<Cliente> buscarTodos() {
        return this.set.stream().toList();
    }
}
