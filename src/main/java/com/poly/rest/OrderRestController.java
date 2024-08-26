package com.poly.rest;

import com.fasterxml.jackson.databind.JsonNode;
import com.poly.dao.OrderDAO;
import com.poly.entity.Order;
import com.poly.entity.Product;
import com.poly.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/orders")
public class OrderRestController {

    @Autowired
    OrderService orderService;

    @Autowired
    OrderDAO orderDAO;

    @GetMapping
    public List<Order> getAll() {
        return orderDAO.findAll();
    }

    @PostMapping
    public Order create(@RequestBody JsonNode orderData) {
        return orderService.create(orderData);
    }
}
