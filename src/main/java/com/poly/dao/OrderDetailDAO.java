package com.poly.dao;

import com.poly.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long> {
//	@Query(value = "SELECT sum(o.price * o.quantity) FROM OrderDetails o", nativeQuery = true)
//	String countSumOrder();
}
