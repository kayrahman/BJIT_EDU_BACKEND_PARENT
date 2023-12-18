package com.bjit.edu_backend.backend.repository;

import com.bjit.edu_backend.backend.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
