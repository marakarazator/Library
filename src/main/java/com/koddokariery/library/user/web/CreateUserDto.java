package com.koddokariery.library.user.web;

import com.koddokariery.library.user.UserRole;

import javax.persistence.Enumerated;
import java.time.LocalDateTime;

public class CreateUserDto {

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private UserRole userRole;

//    public CreateUserDto(String firstName, String lastName, String email, String password, UserRole userRole) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.password = password;
//        this.userRole = userRole;
//    }

    public CreateUserDto() {
    }

//setters and getters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}
