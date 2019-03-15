package com.vsc.repositories;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vsc.models.Book;

@RepositoryRestResource(collectionResourceRel="books",path="books")
public interface BookRepository extends MongoRepository<Book, Serializable> {
	
}
