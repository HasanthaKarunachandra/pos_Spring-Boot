package com.shototech.pos.db;

import com.shototech.pos.dto.core.CustomerDto;
import com.shototech.pos.dto.requst.RequestCustomerDto;
import com.shototech.pos.dto.response.ResponseCustomerDto;

import java.util.ArrayList;
import java.util.Random;

public class Database {

    public static ArrayList<CustomerDto> customerTable = new ArrayList<>();

    public ResponseCustomerDto createCustomer(RequestCustomerDto dto){
        CustomerDto customerDto=new CustomerDto(
                new Random().nextInt(100001),
                new Random().nextInt(100001),
                dto.getName(),
                dto.getAddress(),
                dto.getSalary(),
                true
        );
        customerTable.add(customerDto);
        return new ResponseCustomerDto(
                customerDto.getPublicId(),
                dto.getName(),
                dto.getAddress(),
                dto.getSalary(),
                customerDto.isActiveState()
        );
    }
}
