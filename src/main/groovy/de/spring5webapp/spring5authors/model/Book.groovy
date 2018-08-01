package de.spring5webapp.spring5authors.model

import groovy.transform.EqualsAndHashCode

import javax.persistence.*

@EqualsAndHashCode
@Entity
class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id
    private String title
    private String iban
    private String publisher

    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors = new HashSet<>()

}