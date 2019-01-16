package com.koddokariery.library.book;

import com.koddokariery.library.author.Author;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String publisher;
    private String description;
    private String isbn;

    @ManyToMany
    @JoinTable(
            name = "books_authors",
            joinColumns = {@JoinColumn(name = "author_id")},
            inverseJoinColumns = {@JoinColumn(name = "book_id")}
    )
    private Set<Author> authorSet;



}
