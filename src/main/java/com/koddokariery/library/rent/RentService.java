package com.koddokariery.library.rent;

import com.koddokariery.library.book.BookService;
import com.koddokariery.library.user.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RentService {

    private final BookService bookService;
    private final UserService userService;
    private final RentRepository rentRepository;
    private final RentMapper rentMapper;

    public RentService(BookService bookService, UserService userService, RentRepository rentRepository, RentMapper rentMapper) {
        this.bookService = bookService;
        this.userService = userService;
        this.rentRepository = rentRepository;
        this.rentMapper = rentMapper;
    }

    @Transactional
    public void addRent(CreateRentDto createRentDto) {
        Rent rent = rentMapper.createNew(createRentDto);
        rentRepository.save(rent);
    }


    public RentResponse getOneById(Long id) {
        Rent rent = rentRepository.findById(id);
        return rentMapper.map(rent);
    }



//    public List<RentResponse> getAllRentals() {
//        return rentRepository.findAll().stream()
//               .map(rentMapper::map).collect(Collectors.toList());
//    }
}
