package com.Hybris.Internship.service;

import com.Hybris.Internship.model.OrderItems;
import com.Hybris.Internship.model.Orders;
import com.Hybris.Internship.model.Products;

import java.util.List;

public interface MainService {
    public List<Orders> getAllOrders();
    public List<Products> getAllProducts();
    public List<OrderItems> getAllOrderItems();
    public String getInfoOrder(Long id);
}