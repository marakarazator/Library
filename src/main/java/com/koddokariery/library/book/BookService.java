package com.koddokariery.library.book;

import com.koddokariery.library.author.AuthorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Service
public class BookService {

    public final BookRepository bookRepository;
    public final AuthorRepository authorRepository;
    public final BookMapper bookMapper;


    public BookService(BookRepository bookRepository, AuthorRepository authorRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.bookMapper = bookMapper;
    }

    public List<BookResponse> findAllBooks(){
        return bookRepository.findAll().stream().map(bookMapper::map).collect(toList());
        //bookRepository.findAll().map(bookMapper::map).stream().collect(Collectors.toList());
    }


     @Transactional
    public void addBook(CreateBookDto createBookDto) {
        Book book = bookMapper.createNew(createBookDto);
        bookRepository.save(book);
    }
}
