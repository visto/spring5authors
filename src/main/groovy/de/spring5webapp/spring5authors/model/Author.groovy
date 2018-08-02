package de.spring5webapp.spring5authors.model

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

import javax.persistence.*

@Entity
@EqualsAndHashCode(includes = 'id')
@ToString(includes = 'id')
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id
    private String firstName
    private String lastName

    @ManyToMany(mappedBy = "authors")
    Set<Book> books = new HashSet<>()
}
