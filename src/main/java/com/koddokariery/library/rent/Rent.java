package com.koddokariery.library.rent;

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

    @Column()
    private LocalDateTime timeOfRent = LocalDateTime.now();

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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
