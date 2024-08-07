package com.hantel.event_manager.repository;

import com.hantel.event_manager.entity.Musical;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class MusicalRepository {
    private final EntityManager entityManager;
    public static final String FIND_ALL = "from Musical";

    @Autowired
    public MusicalRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Musical findById(Long id) {
        return entityManager.find(Musical.class, id);
    }

    public List<Musical> findAll() {
        return entityManager.createQuery(FIND_ALL, Musical.class).getResultList();
    }

    public void save(Musical musical) {
        entityManager.persist(musical);
    }
}
