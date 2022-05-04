package com.study.jpastudy.persistenceContext;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PersistenceTest {
    @PersistenceContext
    private static EntityManager em;

    public static void main(String[] args) {

        Member m1 = new Member("member1", "팀원1");

        em.persist(m1);

        Member copyM1 = em.find(Member.class, "member1");

        System.out.println(m1);



    }
}
