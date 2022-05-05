package com.study.jpastudy.persistenceContext;

public class PersistenceTest {


    public static void main(String[] args) {

        MyPersistenceMethod em = new MyPersistenceMethod();


        Member m1 = new Member("member1", "팀원1");

        em.persist(m1);

        Member copyM1 = em.find(Member.class, "member1");
        Member dcopyM1 = em.find(Member.class, "member2");

        System.out.println("dcopyM1 == copyM1 >>> " + (dcopyM1 == copyM1));

        em.flush();
    }
}
