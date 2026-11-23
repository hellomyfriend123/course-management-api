package com.phucnm.orangelearning.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "AppUser")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "username", unique = true,  nullable = false, columnDefinition = "NVARCHAR(50)")
    private String username;

    @Column (name = "password", unique = true, nullable = false, length = 100, columnDefinition = "NVARCHAR(100)")
    private String password;

    @Column (name = "role", unique = true, nullable = false, length = 100, columnDefinition = "VARCHAR(20)")
    private String role;
}
