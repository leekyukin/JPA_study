package com.study.jpastudy.relationship.단방향.JAVA;

public class Test1 {
    public static void main(String[] args) {

        Member member1 = new Member("member1", "회원1");
        Member member2 = new Member("member2", "회원2");

        Team team1 = new Team("Team1", "팀1");

        member1.setTeam(team1);
        member2.setTeam(team1);

        Team findTeam = member1.getTeam();

        System.out.println(">>> " + findTeam);
    }
}
