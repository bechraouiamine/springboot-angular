package tn.bechraoui.springbootangular.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import tn.bechraoui.springbootangular.entity.Book;

@CrossOrigin("*")
public interface BookRepository extends JpaRepository<Book, Long> {
	
	@RestResource(path="cat")
	Page<Book> findByCategoryId(@Param("id") Long id, Pageable pageable);
}
