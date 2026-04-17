package com.guilherme.course.repositories;

import com.guilherme.course.entities.Order;
import com.guilherme.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
