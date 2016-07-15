package by.pvt.pankova.dao.objects;

import by.pvt.pankova.enums.Users;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 2452855864665980260L;

    private String login;
    private String password;
    private Users role;

    public User() {
    }

    public User(String login, String password, String role) {
        this.login = login;
        this.password = password;
        this.role = Users.valueOf(role);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Users getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = Users.valueOf(role);
    }

    public void setRole(Users role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User [login=" + login + ", password=" + password + ", role=" + role + "]";
    }
}