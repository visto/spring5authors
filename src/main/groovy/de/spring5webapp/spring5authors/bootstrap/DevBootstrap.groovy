package de.spring5webapp.spring5authors.bootstrap

import de.spring5webapp.spring5authors.model.Author
import de.spring5webapp.spring5authors.model.Book
import de.spring5webapp.spring5authors.model.Publisher
import de.spring5webapp.spring5authors.repositories.AuthorRepository
import de.spring5webapp.spring5authors.repositories.BookRepository
import de.spring5webapp.spring5authors.repositories.PublisherRepository
import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.stereotype.Component

@Component
class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

    private AuthorRepository authorRepository
    private BookRepository bookRepository
    private PublisherRepository publisherRepository

    DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.bookRepository = bookRepository
        this.authorRepository = authorRepository
        this.publisherRepository = publisherRepository
    }

    @Override
    void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData()
    }

    private void initData() {
        Author viktor = new Author(firstName: "Viktor", lastName: "Stoitschev")
        Publisher springer = new Publisher(name: "Springer", address: "Mehringdamm 33, 10961 Berlin")

        Book rt = new Book(title: "Ask and you will be given", publisher: springer)
        viktor.books.add(rt)
        rt.authors.add(viktor)
        publisherRepository.save(springer)
        authorRepository.save(viktor)
        bookRepository.save(rt)


        //Eric
        Author eric = new Author(firstName: "Eric", lastName: "Evans");
        Book ddd = new Book(title: "Domain Driven Design", isbn: "1234", publisher: springer);
        eric.books = [ddd]
        ddd.authors = [eric]

        authorRepository.save(eric);
        bookRepository.save(ddd);

    }
}
