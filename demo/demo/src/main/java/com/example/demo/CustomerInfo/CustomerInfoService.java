package com.example.demo.CustomerInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerInfoService {
    @Autowired
    CustomerInfoRepository customerInfoRepository;
    public CustomerInfoModelResponse customerInfoCreate (CustomerInfoModelRequest request){
        CustomerInfoEntity customerInfoEntity = new CustomerInfoEntity();
        customerInfoEntity.setCustomerID(request.getCustomerID());
        customerInfoEntity.setAge(request.getAge());
        customerInfoEntity.setPhone(request.getPhone());
        customerInfoEntity.setEMail(request.getEMail());
        customerInfoEntity.setLastName(request.getLastName());
        customerInfoEntity.setFirstName(request.getFirstName());
        customerInfoEntity.setSex(request.getSex());
        customerInfoEntity.setTitle(request.getTitle());
        customerInfoEntity.setBirthday(request.getBirthday());
        customerInfoEntity.setJob(request.getJob());
        customerInfoEntity.setNational(request.getNational());
        customerInfoEntity.setPersonalID(request.getPersonalID());
        customerInfoEntity.setAddress(request.getAddress());
        //Create to response the format

        CustomerInfoEntity customerInfoEntityResponse = customerInfoRepository.save(customerInfoEntity);//Insert Into ....
        //Create to execute

        CustomerInfoModelResponse response = new CustomerInfoModelResponse();
        response.setEMail(customerInfoEntityResponse.getEMail());
        response.setPhone(customerInfoEntityResponse.getPhone());
        response.setFirstName(customerInfoEntityResponse.getFirstName());
        response.setLastName(customerInfoEntityResponse.getLastName());
        //Mapping Value to return to FrontEnd

        return response;
    }
}
