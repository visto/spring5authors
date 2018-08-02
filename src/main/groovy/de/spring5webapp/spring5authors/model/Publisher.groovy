package de.spring5webapp.spring5authors.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id
    String name
    String address
}
