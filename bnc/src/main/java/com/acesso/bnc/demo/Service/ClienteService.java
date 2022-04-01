package com.acesso.bnc.demo.Service;

import com.acesso.bnc.demo.entity.Cliente;
import com.acesso.bnc.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listacliente(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarporId(Long id){
        return clienteRepository.findById(id);
    }

    public void removerPorId(Long id){
        clienteRepository.deleteById(id);
    }
}
