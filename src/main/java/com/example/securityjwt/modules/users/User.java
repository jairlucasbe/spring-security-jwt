package com.example.securityjwt.modules.users;

import java.util.List;

import com.example.securityjwt.modules.auth.repositories.Token;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Token> tokens;

}
