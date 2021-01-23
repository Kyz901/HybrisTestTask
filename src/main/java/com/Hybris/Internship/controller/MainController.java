package com.Hybris.Internship.controller;

import com.Hybris.Internship.dto.OrderItemsDto;
import com.Hybris.Internship.dto.OrdersDto;
import com.Hybris.Internship.dto.ProductsDto;
import com.Hybris.Internship.service.MainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/testtask")
@RequiredArgsConstructor
public class MainController {
    private final MainService mainService;

    @GetMapping("/orders/all")
    public List<OrdersDto> getAllOrders(){
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        return mapperFactory.getMapperFacade().mapAsList(mainService.getAllOrders(),OrdersDto.class);
    }

    @GetMapping("/orders")
    public String getInfoOrder(@RequestParam Long id){

        return mainService.getInfoOrder(id);

    }
    @GetMapping("/products/all")
    public List<ProductsDto> getAllProducts(){
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        return mapperFactory.getMapperFacade().mapAsList(mainService.getAllOrders(),ProductsDto.class);
    }
    @GetMapping("/orderitem/all")
    public List<OrderItemsDto> getAllOrderItems(){
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        return mapperFactory.getMapperFacade().mapAsList(mainService.getAllOrders(),OrderItemsDto.class);
    }
}
