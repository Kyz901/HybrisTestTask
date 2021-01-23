package com.Hybris.Internship.dto;

import com.Hybris.Internship.model.Orders;
import com.Hybris.Internship.model.Products;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class OrderItemsDto {
    private Orders orders;
    private Products products;
    private Long quantity;
}
