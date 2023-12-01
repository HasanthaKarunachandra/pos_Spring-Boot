package com.shototech.pos.dto.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private long id;
    private long publicId;
    private String name;
    private String address;
    private double salary;
    private boolean activeState;
}
