package br.edu.ifg.pw.storecluster.service;

import br.edu.ifg.pw.storecluster.dto.Purchase;
import br.edu.ifg.pw.storecluster.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}