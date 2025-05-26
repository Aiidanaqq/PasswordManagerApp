package com.example.passwordmanagerapp;

public class PasswordEntry {
    private final String website;
    private final String username;
    private final String encryptedPassword;

    public PasswordEntry(String website, String username, String encryptedPassword) {
        this.website = website;
        this.username = username;
        this.encryptedPassword = encryptedPassword;
    }

    public String getWebsite() { return website; }
    public String getUsername() { return username; }
    public String getEncryptedPassword() { return encryptedPassword; }

    @Override
    public String toString() {
        return website + " - " + username;
    }
}

