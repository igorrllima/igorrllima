package io.github.igorrllima.vendas.Service;

import io.github.igorrllima.vendas.model.Client;
import io.github.igorrllima.vendas.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private  ClientRepository repository;
    @Autowired
    public ClientService(ClientRepository repository){
        this.repository = repository;
    }
    public void salvarCliente(Client cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }
    public void validarCliente(Client cliente){
        //Aplica validações
    }
}
