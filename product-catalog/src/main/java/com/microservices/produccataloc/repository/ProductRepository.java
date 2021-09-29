package com.microservices.produccataloc.repository;

import com.microservices.produccataloc.model.Product;
import org.springframework.data.repository.CrudRepository;

/*
*   O repositorys gerencia a ENTIDADE (classe Product) e realiza o CRUD (Create Read Update Delet)
*   No Spring os repositorys nao precisa ser uma classe , pode ser uma ESPECIFICAÇÃO(Interface)
*   etends CrudRepository = execulta o CRUD
*/

public interface ProductRepository extends CrudRepository<Product, Long> {
}
