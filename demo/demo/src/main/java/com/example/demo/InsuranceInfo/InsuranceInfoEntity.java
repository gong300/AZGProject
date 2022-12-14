package com.example.demo.InsuranceInfo;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@ToString

public class InsuranceInfoEntity {
    @Id
    @Column
    private String InsuranceID;

    @Column
    private String InsurancePic; // frontend give base 64 to us

    @Column
    private String InsurancePrice;

    @Column
    private String InsuranceDetails;

}
