package amol.springfreamwork.spring6webapp.bootstrap;

import amol.springfreamwork.spring6webapp.domain.Author;
import amol.springfreamwork.spring6webapp.domain.Book;
import amol.springfreamwork.spring6webapp.repositories.AuthorRepository;
import amol.springfreamwork.spring6webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Author ericSave = authorRepository.save(eric);
        Book dddSave = bookRepository.save(ddd);


        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE Develpment without EJB");
        noEJB.setIsbn("987654321");


        Author rodSave = authorRepository.save(rod);
        Book noEJBSave = bookRepository.save(noEJB);

        ericSave.getBooks().add(dddSave);
        rodSave.getBooks().add(noEJBSave);


        authorRepository.save(ericSave);
        authorRepository.save(rodSave);


        System.out.println("In BootstrapData");
        System.out.println("AuthorCount: " + authorRepository.count());
        System.out.println("BookCount: " + bookRepository.count());
    }
}
