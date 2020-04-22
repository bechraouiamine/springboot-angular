package tn.bechraoui.springbootangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tn.bechraoui.springbootangular.entity.Category;

@RepositoryRestResource(collectionResourceRel="bookcategory")
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
