package com.coza.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Orders")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String address;
    LocalDate createdate;
    String phone;
    int status;
    float totalprice;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private OrderDetail orderDetail;

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private Account account;
}
