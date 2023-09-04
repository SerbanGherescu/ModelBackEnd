package com.example.modelbackend.data_access_object;

import com.example.modelbackend.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "products_repository", path = "products_repository")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {



}
