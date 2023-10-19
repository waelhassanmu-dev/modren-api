package com.modren.controller;

import com.modren.api.CartApi;
import com.modren.api.model.Cart;
import com.modren.api.model.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class CartController implements CartApi {

    private static final Logger log = LoggerFactory.getLogger(CartController.class);

    @Override
    public ResponseEntity<List<Item>> addCartItemsByCustomerId(String customerId, @Valid Item item) {
        log.info("Request for customer ID: {}\nItem: {}", customerId, item);
        return ok(Collections.emptyList());
    }

    @Override
    public ResponseEntity<List<Item>> addOrReplaceItemsByCustomerId(String customerId,
                                                                    @Valid Item item) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteCart(String customerId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteItemFromCart(String customerId, String itemId) {
        return null;
    }

    @Override
    public ResponseEntity<List<Cart>> getCartByCustomerId(String customerId) {
        throw new RuntimeException("Manual Exception thrown");
    }

    @Override
    public ResponseEntity<List<Item>> getCartItemsByCustomerId(String customerId) {
        return null;
    }

    @Override
    public ResponseEntity<List<Item>> getCartItemsByItemId(String customerId, String itemId) {
        return null;
    }
}
