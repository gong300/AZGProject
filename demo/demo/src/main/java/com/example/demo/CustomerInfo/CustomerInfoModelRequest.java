package com.example.demo.CustomerInfo;

import lombok.Data;

import javax.persistence.Column;

@Data
public class CustomerInfoModelRequest {

    private String CustomerID ;
    private String FirstName;
    private String LastName;
    private String EMail;
    private String Phone;
    private String Sex;
    private String Age;
    private String Title;
    private String Birthday;
    private String Job;
    private String National;
    private String PersonalID;
    private String Address;
}
