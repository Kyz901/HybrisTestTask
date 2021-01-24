package com.Hybris.Internship.controller;

import com.Hybris.Internship.dto.OrderItemsDto;
import com.Hybris.Internship.dto.OrdersDto;
import com.Hybris.Internship.dto.ProductsDto;
import com.Hybris.Internship.model.Products;
import com.Hybris.Internship.model.Status;
import com.Hybris.Internship.service.MainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
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
    @GetMapping("/products/all")
    public List<ProductsDto> getAllProducts(){
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        return mapperFactory.getMapperFacade().mapAsList(mainService.getAllProducts(),ProductsDto.class);
    }
    @GetMapping("/orderitem/all")
    public List<OrderItemsDto> getAllOrderItems(){
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        return mapperFactory.getMapperFacade().mapAsList(mainService.getAllOrderItems(),OrderItemsDto.class);
    }
    @PostMapping("/products")
    public void createProduct(@RequestParam String name,
                        @RequestParam Double price,
                        @RequestParam String status ){
        Products product = new Products();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();


        product.setName(name);
        product.setPrice(price);
        product.setStatus(status);
        product.setCreateAt(format.format(date));
        mainService.createProduct(product);
    }
    @DeleteMapping("/products")
    public boolean deleteProductById(@RequestParam Long id){
        return  mainService.deleteProductById(id);
    }
    @DeleteMapping("/products/all")
    public boolean deleteAllProducts(@RequestParam String pass){
        if(pass.equals("MyPassword")){
            return  mainService.deleteAllProducts(pass);
        } else return false;

    }
}
