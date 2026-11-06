package com.lizzy.password_manager.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Credential {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long credentialId;


    //Ex: Google, GitHub, etc
    @Column(nullable = false)
    @NotBlank(message = "Service name can't be empty.")
    private String serviceName;


    //Ex: Username, email, etc
    private String username;

    @Column(nullable = false)
    @Size(max = 500)
    @NotBlank(message = "Password can't be empty.")
    private String encryptedPassword;


    private String websiteUrl;


    private String notes;

    //Ex: Social Media, Development, etc
    private String category;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;


    @PrePersist
    public void prePersist() {
        LocalDateTime now = LocalDateTime.now();
        this.createdAt = now;
        this.updatedAt = now;
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}
