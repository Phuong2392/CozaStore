package com.coza.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Account")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account implements Serializable {
    @Id
    String username;
    String password;
    String fullname;
    String phone;
    String email;
    Boolean isadmin;
    Boolean isactived;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Orders> orders;
}