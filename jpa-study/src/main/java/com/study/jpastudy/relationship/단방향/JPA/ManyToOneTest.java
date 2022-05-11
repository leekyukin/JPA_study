package com.study.jpastudy.relationship.단방향.JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class ManyToOneTest {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory();


        Team team1 = new Team("Team1", "팀1");
        \


    }
}
