package br.edu.ifg.pw.storecluster.dto;

import br.edu.ifg.pw.storecluster.entity.Address;
import br.edu.ifg.pw.storecluster.entity.Customer;
import br.edu.ifg.pw.storecluster.entity.Order;
import br.edu.ifg.pw.storecluster.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}