package com.interfacemapping.MappingUdemy.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ch")
public class Check extends Payment {
    @Column(name="checknumber")
    private String CheckNumber;

    public String getCheckNumber() {
        return CheckNumber;
    }

    public void setCheckNumber(String checkNumber) {
        CheckNumber = checkNumber;
    }
}
