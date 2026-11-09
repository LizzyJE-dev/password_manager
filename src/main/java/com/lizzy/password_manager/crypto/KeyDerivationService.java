package com.lizzy.password_manager.crypto;

import java.security.SecureRandom;

public class KeyDerivationService {

    private final SecureRandom secureRandom = new SecureRandom();

    public byte[] generateSalt(){
        byte[] salt = new byte[16];
        secureRandom.nextBytes(salt);
        return salt;
    }
}
