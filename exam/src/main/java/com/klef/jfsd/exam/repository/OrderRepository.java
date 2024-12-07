package com.klef.jfsd.exam.repository;

import com.klef.jfsd.exam.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
	
}
