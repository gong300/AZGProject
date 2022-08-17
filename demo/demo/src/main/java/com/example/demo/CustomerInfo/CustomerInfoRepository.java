package com.example.demo.CustomerInfo;

import org.apache.logging.log4j.util.StringBuilderFormattable;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.print.DocFlavor;

public interface CustomerInfoRepository extends JpaRepository<CustomerInfoEntity,String> {
}
