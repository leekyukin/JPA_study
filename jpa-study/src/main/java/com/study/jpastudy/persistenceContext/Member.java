package com.study.jpastudy.persistenceContext;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.lang.management.ManagementFactory;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString(of = "memberId")
public class Member {

    @Id
    private String memberId;

    private String name;

    public Member() {

    }
}
