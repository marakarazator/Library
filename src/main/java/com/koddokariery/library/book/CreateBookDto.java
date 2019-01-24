package com.koddokariery.library.book;



public class CreateBookDto {

    private String description;
    private String title;
    private Long authorId;

    //constructor

    public CreateBookDto() {
    }

    public CreateBookDto(String description, String title, Long authorId) {
        this.description = description;
        this.title = title;
        this.authorId = authorId;
    }

    //setters and getters

    //
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }
}
