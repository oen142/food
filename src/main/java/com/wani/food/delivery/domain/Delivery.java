package com.wani.food.delivery.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DELIVERIES")
public class Delivery {

    public enum DeliveryStatus {DELIVERING, DELIVERED}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DELIVERY_ID")
    private Long id;

    @Column(name = "ORDER_ID")
    private Long orderId;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    private DeliveryStatus deliveryStatus;

    public static Delivery started(Long orderId) {
        return new Delivery(orderId, DeliveryStatus.DELIVERING);
    }

    public Delivery(Long orderId, DeliveryStatus deliveryStatus) {
        this(null, orderId, deliveryStatus);
    }

    public Delivery(Long id, Long orderId,
        DeliveryStatus deliveryStatus) {
        this.id = id;
        this.orderId = orderId;
        this.deliveryStatus = deliveryStatus;
    }

    Delivery() {
    }

    public void complete() {
        this.deliveryStatus = DeliveryStatus.DELIVERED;
    }
}
