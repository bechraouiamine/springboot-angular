package tn.bechraoui.springbootangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.bechraoui.springbootangular.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
