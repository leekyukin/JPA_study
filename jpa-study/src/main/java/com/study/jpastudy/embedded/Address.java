package com.study.jpastudy.embedded;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {
    private City city;
    private String district;
    private String detail;
    private String zipCode;
}
