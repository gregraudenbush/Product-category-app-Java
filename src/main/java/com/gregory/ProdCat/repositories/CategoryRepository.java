package com.gregory.ProdCat.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gregory.ProdCat.models.Category;

@Repository
public interface CategoryRepository extends CrudRepository <Category, Long>{

}
