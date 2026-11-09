package com.lizzy.password_manager.repository;

import com.lizzy.password_manager.entity.Vault;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaultRepository extends JpaRepository<Vault, Long> {
}
