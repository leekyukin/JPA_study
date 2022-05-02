package com.study.jpastudy.relationship.단방향.JPA;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Member {
    @Id
    @Column(name = "MEMBER_ID")
    private String Id;

    private String username;

    // 연관관계 패핑
    @ManyToOne
    @JoinColumn(name = "TEAM_ID")   // 생략가능, name 속성에는 매핑할 외래키를 입력한다.
    private Team team;

    // 연관관계 설정
    public void setTeam(Team team) {
        this.team = team;
    }
}
