package com.klef.jfsd.exam.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @Column(name = "order_id", nullable = false, unique = true)
    private Long orderId;

    @NotNull
    @Column(name = "product_name")
    private String productName;

    @NotNull
    private Integer quantity;

    @NotNull
    @Column(name = "order_date")
    private String orderDate; // ISO 8601 format (e.g., 2024-12-07)

    @NotNull
    @Column(name = "customer_name")
    private String customerName;

    // Getters and Setters
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
