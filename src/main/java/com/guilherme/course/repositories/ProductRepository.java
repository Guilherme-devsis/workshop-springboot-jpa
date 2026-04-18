package com.guilherme.course.repositories;

import com.guilherme.course.entities.Category;
import com.guilherme.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
