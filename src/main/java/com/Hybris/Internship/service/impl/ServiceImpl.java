package com.Hybris.Internship.service.impl;

import com.Hybris.Internship.model.OrderItems;
import com.Hybris.Internship.model.Products;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import com.Hybris.Internship.model.Orders;
import com.Hybris.Internship.repository.OrderItemsRepository;
import com.Hybris.Internship.repository.OrdersRepository;
import com.Hybris.Internship.repository.ProductsRepository;
import com.Hybris.Internship.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class ServiceImpl implements MainService {
    private final OrdersRepository ordersRepository;
    private final ProductsRepository productsRepository;
    private final OrderItemsRepository orderItemsRepository;

    @Override
    public List<Orders> getAllOrders() {

        return ordersRepository.findAll().stream().collect(Collectors.toList());
    }
    @Override
    public String getInfoOrder(Long id){
        Orders orders = ordersRepository.getOne(id);
        String info = orders.getUserId() + " " + orders.getStatus() + " " + orders.getCreatedAt();
        return info;
    }
    @Override
    public List<Products> getAllProducts() {
        return productsRepository.findAll().stream().collect(Collectors.toList());
    }

    @Override
    public List<OrderItems> getAllOrderItems() {
        return orderItemsRepository.findAll().stream().collect(Collectors.toList());
    }
}
