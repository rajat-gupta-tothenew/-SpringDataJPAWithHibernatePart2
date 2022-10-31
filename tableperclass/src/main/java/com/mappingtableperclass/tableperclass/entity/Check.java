package com.mappingtableperclass.tableperclass.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="bankcheck")
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
