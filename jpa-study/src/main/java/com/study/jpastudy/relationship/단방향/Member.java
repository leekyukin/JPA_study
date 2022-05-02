package com.study.jpastudy.relationship.단방향;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Member {

    private String id;
    private String username;

    private Team team; // Member 에서만 참조하고 있다.
    // Member -> Team (O)
    // Team -> Member (X)
    // ㄴ> 단방향

    public Member(String id, String username) {
        this.id = id;
        this.username = username;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
