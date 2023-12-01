package com.shototech.pos.api;

import com.shototech.pos.dto.requst.RequestCustomerDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @PostMapping
    public String createCustomer(
            @RequestBody RequestCustomerDto customerDto
    ){
        return "createCustomer";
    }

    @PutMapping
    public String updateCustomer(){
        return "updateCustomer";
    }

    @DeleteMapping
    public String deleteCustomer(){
        return "deleteCustomer";
    }

    @GetMapping
    public String findCustomer(){
        return "findCustomer";
    }

    @GetMapping("/list")
    public String getAllCustomer(){
        return "getAllCustomers";
    }

}
