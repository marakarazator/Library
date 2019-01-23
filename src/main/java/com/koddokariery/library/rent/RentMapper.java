package com.koddokariery.library.rent;

import com.koddokariery.library.book.BookRepository;
import com.koddokariery.library.book.BookService;
import com.koddokariery.library.user.UserRepository;
import com.koddokariery.library.user.UserService;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class RentMapper {
    private BookRepository bookRepository;
    private UserRepository userRepository;


    public RentMapper(BookRepository bookRepository, UserRepository userRepository) {
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
    }

    public Rent createNew(CreateRentDto createRentDto){
        Rent rent = new Rent();
        rent.setTimeOfRent(LocalDateTime.now());
        rent.setBook(bookRepository.findById(createRentDto.getBookId()));
        rent.setUser(userRepository.findById(createRentDto.getUserId()));
        return rent;
    }

    public RentResponse map(Rent rentEntity){
        return new RentResponse(rentEntity.getId(), rentEntity.getTimeOfRent(),
                rentEntity.getUser().getId(), rentEntity.getBook().getId());
    }




}
