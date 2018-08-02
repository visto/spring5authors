package de.spring5webapp.spring5authors.repositories;

import de.spring5webapp.spring5authors.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
}
