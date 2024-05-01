package com.coza.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Account")
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