package com.study.jpastudy.relationship.단방향.JPA;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public interface PersistenceRepository {

    @PersistenceContext
    private EntityManager em ;

    public void persist(Object o) {
        em.persist(o);
    }
}
