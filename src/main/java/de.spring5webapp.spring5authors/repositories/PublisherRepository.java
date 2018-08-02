package de.spring5webapp.spring5authors.repositories;

import de.spring5webapp.spring5authors.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{
}
