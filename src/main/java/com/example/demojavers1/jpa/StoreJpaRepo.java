package com.example.demojavers1.jpa;

import com.example.demojavers1.domain.Store;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.JpaRepository;
@JaversSpringDataAuditable
public interface StoreJpaRepo extends JpaRepository<Store,Integer> {
}
