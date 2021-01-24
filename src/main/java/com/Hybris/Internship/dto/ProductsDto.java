package com.Hybris.Internship.dto;

import com.Hybris.Internship.model.Status;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
public class ProductsDto {
    private Long Id;
    private String name;
    private Double price;
    private String status;
    private String createAt;
}
