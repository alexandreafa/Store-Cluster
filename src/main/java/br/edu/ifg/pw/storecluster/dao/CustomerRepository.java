package br.edu.ifg.pw.storecluster.dao;

import br.edu.ifg.pw.storecluster.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer, Long> {


}
