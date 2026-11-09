# Password Manager

A personal password manager built with **Java 21, Spring Boot, and MySQL**.

This project is part of my backend development learning journey, with a focus on building a structured application for managing credentials while exploring cryptographic security and secure data storage practices.

## Overview

The goal of this project is to develop a personal password manager that allows users to store and manage their credentials securely.

The application is designed around a single-user vault architecture, where credential data will be encrypted before being persisted in the database.

## Technologies

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Lombok
- Jakarta Validation

## Architecture

The project follows a layered architecture, separating responsibilities into dedicated packages:

- `entity` – JPA entities and database mappings.
- `repository` – Data access through Spring Data JPA.
- `service` – Business logic.
- `controller` – REST API endpoints.
- `dto` – Data Transfer Objects.
- `exception` – Custom exceptions and centralized exception handling.

## Security Design

The application is being designed around the following cryptographic components:

- **AES-256-GCM** for credential encryption and integrity verification.
- **PBKDF2-HMAC-SHA-256** for deriving cryptographic keys from a master password.
- Random salts and nonces for cryptographic operations.
- Separation of vault metadata from encrypted credential data.

The cryptographic implementation is currently under development.

## Current Progress

- [x] Initial Spring Boot project setup.
- [x] MySQL database connection using environment variables.
- [x] JPA entity design and database relationships.
- [x] Vault and Credential repositories.
- [ ] Master password and vault initialization.
- [ ] PBKDF2 key derivation.
- [ ] AES-256-GCM encryption and decryption.
- [ ] Credential CRUD operations.
- [ ] DTOs and validation.
- [ ] Unit and integration testing.

## Project Status

**Work in Progress**

This project is being developed incrementally as a practical way to strengthen my Java and Spring Boot backend development skills while learning about application security and cryptography.