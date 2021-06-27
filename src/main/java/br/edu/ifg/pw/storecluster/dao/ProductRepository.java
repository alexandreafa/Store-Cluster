package br.edu.ifg.pw.storecluster.dao;

import br.edu.ifg.pw.storecluster.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
