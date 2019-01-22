package com.koddokariery.library.book;

public class BookResponse {
    private long id;
    private String title;
    private String description;
    private Long authorId;
    private String authorFirstName;



    public BookResponse(long id, String title, String description, Long authorId, String authorFirstName) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.authorId = authorId;
        this.authorFirstName = authorFirstName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }
}
