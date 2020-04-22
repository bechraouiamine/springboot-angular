package tn.bechraoui.springbootangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.bechraoui.springbootangular.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
