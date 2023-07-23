package br.com.jwt.DTO;

import br.com.jwt.model.product.ProductModel;

public record ProductResponseDTO(Long id, String name, Double price) {
    public ProductResponseDTO(ProductModel product){
        this(product.getId(), product.getName(), product.getPrice());
    }
}
