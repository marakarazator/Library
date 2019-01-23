package com.koddokariery.library.book;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping
    public List<BookResponse> getAllBooks(){
        return bookService.findAllBooks();
    }

    @PostMapping
    public void addBook(@RequestBody CreateBookDto createBookDto){
        bookService.addBook(createBookDto);
    }


    @GetMapping("/{id}")
    public BookResponse getOne(@PathVariable("id") Long id) {
        return bookService.getOne(id);
    }
}
