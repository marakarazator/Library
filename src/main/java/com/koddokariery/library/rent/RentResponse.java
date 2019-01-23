package com.koddokariery.library.rent;

import java.time.LocalDateTime;

public class RentResponse {
    private long id;
    private LocalDateTime rentDate;
    private long userId;
    private long bookId;

    public RentResponse(long id, LocalDateTime rentDate, long userId, long bookId) {
        this.id = id;
        this.rentDate = rentDate;
        this.userId = userId;
        this.bookId = bookId;
    }

    //setters and getters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDateTime rentDate) {
        this.rentDate = rentDate;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }
}
