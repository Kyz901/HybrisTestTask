package com.Hybris.Internship.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
public class OrdersDto {
    private Long Id;
    private Long userId;
    private String status;
    private String createdAt;
}
