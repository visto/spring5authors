package de.spring5webapp.spring5authors.model

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

import javax.persistence.*

@Entity
@EqualsAndHashCode(includes = 'id')
@ToString(includes = 'id')
class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id
    private String title
    private String isbn

    @OneToOne
    private Publisher publisher

    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    Set<Author> authors = new HashSet<>()
}