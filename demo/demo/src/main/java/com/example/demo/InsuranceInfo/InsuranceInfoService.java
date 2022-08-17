package com.example.demo.InsuranceInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsuranceInfoService {

    @Autowired
    InsuranceInfoRepository insuranceInfoRepository;

    public InsuranceInfoModelResponse insuranceInfoCreate (InsuranceInfoModelRequest request){
        InsuranceInfoEntity insuranceInfoEntity = new InsuranceInfoEntity();
        insuranceInfoEntity.setInsuranceID(request.getInsuranceID());
        insuranceInfoEntity.setInsurancePic(request.getInsurancePic());
        insuranceInfoEntity.setInsuranceDetails(request.getInsuranceDetails());
        insuranceInfoEntity.setInsurancePrice(request.getInsurancePrice());

        InsuranceInfoEntity insuranceInfoEntityResponse = insuranceInfoRepository.save(insuranceInfoEntity);

        InsuranceInfoModelResponse response = new InsuranceInfoModelResponse();
        response.setInsuranceInfoDetails(insuranceInfoEntityResponse.getInsuranceDetails());
        response.setInsuranceInfoPics(insuranceInfoEntityResponse.getInsurancePic());
        response.setInsuranceInfoPrice(insuranceInfoEntityResponse.getInsurancePrice());

        return response;
    }
}
