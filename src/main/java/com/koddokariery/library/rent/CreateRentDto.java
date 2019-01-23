package com.koddokariery.library.rent;

import java.time.LocalDateTime;

public class CreateRentDto {

    private Long userId;
    private Long bookId;
    private LocalDateTime rentDate;

    public CreateRentDto() {
    }

    public CreateRentDto(Long userId, Long bookId, LocalDateTime rentDate) {
        this.userId = userId;
        this.bookId = bookId;
        this.rentDate = rentDate;
    }

    //setters and getters

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public LocalDateTime getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDateTime rentDate) {
        this.rentDate = rentDate;
    }
}
