package com.example.marketplace.order;

import com.example.marketplace.address.Address;
import com.example.marketplace.cart.Cart;
import com.example.marketplace.user.User;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private Long id;
    private double totalAmount;

    private OrderStatus status;
    private User user;
    private Address shippingAddress;
    private Address billingAddress;
    private LocalDate orderDate;
    private List<Cart> OrderdItems;
}
