package br.com.fiap.ecommerceapi.produtos;

import br.com.fiap.ecommerceapi.produtos.dto.ProdutosRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProdutosController {

    @Autowired
    ProdutosService service;

    @GetMapping
    public List<Produtos> findAll(){
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Produtos> create(@RequestBody ProdutosRequest produtosRequest, UriComponentsBuilder uriBuilder){
        var produtos = service.create(produtosRequest.toModel());

        var uri = uriBuilder
                .path("/products/{id}")
                .buildAndExpand(produtos.getId())
                .toUri();

        return ResponseEntity.created(uri).body(produtos);
    }

}
