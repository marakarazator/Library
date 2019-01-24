package com.koddokariery.library.book;

import com.koddokariery.library.author.AuthorRepository;
import com.koddokariery.library.author.AuthorService;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    private final AuthorService authorService;


    public BookMapper(AuthorService authorService) {
        this.authorService = authorService;
    }

    public BookResponse map(Book bookEntity){
        return new BookResponse(bookEntity.getId(), bookEntity.getTitle(),
                bookEntity.getDescription(), bookEntity.getAuthor().getId(), bookEntity.getAuthor().getFirstName());
    }

    public Book createNew(CreateBookDto createBookDto) {
        Book book = new Book();
        book.setDescription(createBookDto.getDescription());
        book.setTitle(createBookDto.getTitle());
        book.setAuthor(authorService.findAuthor(createBookDto.getAuthorId()));
        return book;
    }

}
