package it.ntt.hellospringboot.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String surname;

    @OneToMany(mappedBy = "author")
    private Set<Book> bookSet = new HashSet<>();

    public Author() {
    }

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }


    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return Set<Book> return the bookSet
     */
    public Set<Book> getBookSet() {
        return bookSet;
    }

    /**
     * @param bookSet the bookSet to set
     */
    public void setBookSet(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }

}
