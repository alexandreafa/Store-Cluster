package br.edu.ifg.pw.storecluster.service;

import br.edu.ifg.pw.storecluster.dao.ProductRepository;
import br.edu.ifg.pw.storecluster.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product addProduct(Product product) {
        product.setId(UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE);
        return productRepository.save(product);
    }

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public Product findProductById(Long id) {
        return productRepository.findProductById(id);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteProductById(id);
    }
}
