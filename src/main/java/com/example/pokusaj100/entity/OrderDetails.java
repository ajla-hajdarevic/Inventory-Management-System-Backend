package com.example.pokusaj100.entity;

import javax.persistence.*;


@Entity
public class OrderDetails {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order_ order_;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Order_ getOrder() {
        return order_;
    }

    public void setOrder(Order_ order) {
        this.order_ = order;
    }
}
