package br.com.fiap.ecommerceapi.produtos.dto;

import br.com.fiap.ecommerceapi.produtos.Produtos;

public record ProdutosRequest(
        String name,
        String description,
        String image,
        String tag,
        Long price
) {
    public Produtos toModel(){
        return Produtos.builder()
                .name(name)
                .description(description)
                .image(image)
                .tag(tag)
                .price(price)
                .build();
    }


}
