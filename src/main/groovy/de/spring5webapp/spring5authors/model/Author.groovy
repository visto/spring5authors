package de.spring5webapp.spring5authors.model

import javax.persistence.*

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id
    private String firstName
    private String lastName

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>()


}
