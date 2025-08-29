package com.devsuperior.dscatolg.repositories;

import com.devsuperior.dscatolg.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
