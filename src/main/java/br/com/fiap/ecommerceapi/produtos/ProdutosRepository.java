package br.com.fiap.ecommerceapi.produtos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
}
