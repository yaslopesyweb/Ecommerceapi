package br.com.fiap.ecommerceapi.produtos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutosService {

    @Autowired
    ProdutosRepository repository;

    public List<Produtos> findAll(){
        return repository.findAll();
    }
    public Produtos create(Produtos produtos){
        return repository.save(produtos);
    }
}
