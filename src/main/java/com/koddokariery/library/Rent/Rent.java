package com.koddokariery.library.Rent;

import com.koddokariery.library.book.Book;
import com.koddokariery.library.user.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private LocalDateTime  timeOfRent;

    @ManyToOne
    private Book book;

    //getters and setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getTimeOfRent() {
        return timeOfRent;
    }

    public void setTimeOfRent(LocalDateTime timeOfRent) {
        this.timeOfRent = timeOfRent;
    }
}
