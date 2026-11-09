package com.lizzy.password_manager.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "vault")
public class Vault {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vaultId;

    @Column(nullable = false, columnDefinition = "BINARY(16)")
    private byte[] salt;

    @Column(nullable = false, length = 50)
    private String kdfAlgorithm;

    @Column(nullable = false)
    private Integer kdfIterations;

    @Column(nullable = false, columnDefinition = "BINARY(32)")
    private byte[] verifier;

    @Column(nullable = false)
    private Integer cryptoVersion;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
    }
}
