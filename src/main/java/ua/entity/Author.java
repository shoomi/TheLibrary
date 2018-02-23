package ua.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "author")
public class Author extends AbstractEntityId {

    @OneToMany(mappedBy = "mainAuthor")
    private List<Book> ownBooks = new ArrayList<>();

    @ManyToMany(mappedBy = "collaborationAuthors")
    private List<Book> collaborationBooks;

    @Column(name = "first_name", length = 20)
    private String firstName;

    @Column(name = "last_name", length = 20)
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Book> getOwnBooks() {
        return ownBooks;
    }

    public void setOwnBooks(List<Book> ownBooks) {
        this.ownBooks = ownBooks;
    }

    public List<Book> getCollaborationBooks() {
        return collaborationBooks;
    }

    public void setCollaborationBooks(List<Book> collaborationBooks) {
        this.collaborationBooks = collaborationBooks;
    }

    @Override
    public String toString() {
        return String.format("%s %s", getFirstName(), getLastName());
    }

}
