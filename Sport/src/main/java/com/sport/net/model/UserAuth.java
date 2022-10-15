package com.sport.net.model;

public class UserAuth {

    private String login;
    private String email;
    private String key;
    private String salt;

    public UserAuth(String login, String email, String key, String salt) {
        this.login = login;
        this.email = email;
        this.key = key;
        this.salt = salt;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
