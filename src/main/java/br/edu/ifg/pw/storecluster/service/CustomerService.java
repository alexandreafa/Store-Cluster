package br.edu.ifg.pw.storecluster.service;

import br.edu.ifg.pw.storecluster.dao.CustomerRepository;
import br.edu.ifg.pw.storecluster.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer addCustomer(Customer customer) {
        customer.setId(UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE);
        return customerRepository.save(customer);
    }

    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer findCustomerById(Long id) {
        return customerRepository.findCustomerById(id);
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteCustomerById(id);
    }
}
