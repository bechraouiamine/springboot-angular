package tn.bechraoui.springbootangular.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_category")
@Getter
@Setter
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="category_name")
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="category")
	private Set<Book> books;

}
