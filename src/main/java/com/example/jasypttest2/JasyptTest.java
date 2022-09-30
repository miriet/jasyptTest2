package com.example.jasypttest2;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class JasyptTest {

    public static void main(String[] args) {
        String plainText = "Plain text for encryption test";

        StandardPBEStringEncryptor jasypt = new StandardPBEStringEncryptor();
//        jasypt.setAlgorithm("PBEWithMD54AndDES");
        jasypt.setPassword("password");

        String encryptedText = jasypt.encrypt(plainText);
        System.out.println("Encrypted Text: " + encryptedText);
    }
}
