package com.example.demojavers1.jpa;

import com.example.demojavers1.domain.Product;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.JpaRepository;
@JaversSpringDataAuditable
public interface ProductJpaRepo extends JpaRepository<Product,Integer> {
}
