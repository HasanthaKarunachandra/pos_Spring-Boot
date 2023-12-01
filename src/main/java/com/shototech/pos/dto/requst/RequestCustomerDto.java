package com.shototech.pos.dto.requst;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestCustomerDto {
    private String name;
    private String address;
    private double salary;
}
