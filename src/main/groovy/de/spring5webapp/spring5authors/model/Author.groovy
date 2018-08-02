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
    Long id
    String firstName
    String lastName

    @ManyToMany(mappedBy = "authors")
    Set<Book> books = new HashSet<>()
}
