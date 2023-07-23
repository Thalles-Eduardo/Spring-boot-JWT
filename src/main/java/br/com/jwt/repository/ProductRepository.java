package br.com.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jwt.model.product.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, Long>{
    
}
