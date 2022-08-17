package com.example.demo.CustomerInfo;

import lombok.Data;

import javax.persistence.Column;

@Data

public class CustomerInfoModelResponse {
    private String FirstName;
    private String LastName;
    private String EMail;
    private String Phone;
    private String InsurancePolicy;

}
