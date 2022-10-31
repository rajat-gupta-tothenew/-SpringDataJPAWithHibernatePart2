package com.mappingjoined.joined.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="bankcheck")
@PrimaryKeyJoinColumn(name = "id")
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
