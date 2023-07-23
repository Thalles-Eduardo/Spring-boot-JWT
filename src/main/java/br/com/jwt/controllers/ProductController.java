package br.com.jwt.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jwt.DTO.ProductRequestDTO;
import br.com.jwt.DTO.ProductResponseDTO;
import br.com.jwt.model.product.ProductModel;
import br.com.jwt.service.ProductService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("product")
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<?> postProduct(@RequestBody @Valid ProductRequestDTO body){
        ProductModel newProduct = new ProductModel(body);
        this.productService.createProduct(newProduct);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<?> getAllProduct(){
            List<ProductResponseDTO> productList = this.productService.getAllProduct().stream().map(ProductResponseDTO::new).toList();

            return ResponseEntity.ok(productList);
        }
}
