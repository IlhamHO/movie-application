package eu.epfc.movie.repositories;

import eu.epfc.movie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MovieRepository extends JpaRepository<Movie,Long> {

}
