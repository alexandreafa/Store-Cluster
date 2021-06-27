package br.edu.ifg.pw.storecluster.dao;

import br.edu.ifg.pw.storecluster.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface ProductRepository extends JpaRepository<Product, Long> {

}
