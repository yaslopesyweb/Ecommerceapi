package br.com.fiap.ecommerceapi.produtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="products")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Produtos {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String description;
    double price;
    String image;
    String tag;

}
