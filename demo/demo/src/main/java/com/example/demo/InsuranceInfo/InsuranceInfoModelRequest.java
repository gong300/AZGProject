package com.example.demo.InsuranceInfo;

import lombok.Data;

import javax.persistence.Column;

@Data
public class InsuranceInfoModelRequest {

    private String InsuranceID;
    private String InsurancePic;
    private String InsurancePrice;
    private String InsuranceDetails;

}
