package de.spring5webapp.spring5authors.repositories;

import de.spring5webapp.spring5authors.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {


}
