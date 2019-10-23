package com.easy.eat.EASYEATBACK.Repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.easy.eat.EASYEATBACK.Documents.Carrito;

import java.io.Serializable;
import java.util.*;

@Repository
public interface CarritoRepository extends MongoRepository<Carrito,String> {
	

}
