package com.study.jpastudy.relationship.단방향;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(of = "id")
public class Team {

    private String id;
    private String name;

    // Team 에서는 Member 를 참조하지 않아
    // Team -> Member 는 불가능하다.
    // ㄴ> 단방향


    public Team(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

