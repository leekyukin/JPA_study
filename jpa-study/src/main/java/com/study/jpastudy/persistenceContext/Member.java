package com.study.jpastudy.persistenceContext;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.lang.management.ManagementFactory;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Member {

    @Id
    private Long memberId;

    private String name;


    public Member() {

    }
}
