package amol.springfreamwork.spring6webapp.repositories;

import amol.springfreamwork.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
