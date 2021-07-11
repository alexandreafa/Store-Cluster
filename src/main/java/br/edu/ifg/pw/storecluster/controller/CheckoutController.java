package br.edu.ifg.pw.storecluster.controller;

import br.edu.ifg.pw.storecluster.dto.Purchase;
import br.edu.ifg.pw.storecluster.dto.PurchaseResponse;
import br.edu.ifg.pw.storecluster.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}