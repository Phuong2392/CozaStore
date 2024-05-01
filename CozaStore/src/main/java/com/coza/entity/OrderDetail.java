package com.coza.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "OrderDetails")
public class OrderDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    float totalprice;
    int quantity;
    @OneToOne
    @JoinColumn(name = "orderid")
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "productid")
    private Products product;
}
