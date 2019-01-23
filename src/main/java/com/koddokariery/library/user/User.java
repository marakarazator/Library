package com.koddokariery.library.user;


import com.koddokariery.library.rent.Rent;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

   // @Temporal(TemporalType.TIMESTAMP)

    private LocalDateTime createdAt = LocalDateTime.now();

  //  @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime updatedAt;

    private String firstName;
    private String lastName;
    private String email;
    private String password;


    @OneToMany(cascade = CascadeType.REFRESH, mappedBy = "user")
   // @JoinColumn(name = "rent_id", referencedColumnName = "id")
    private Set<Rent> rents;

    @Enumerated(EnumType.STRING)
    private UserRole userRole;


    //is it really necessary to put a constructor inti entity?

    public User() {
    }


    //setters and getters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

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
