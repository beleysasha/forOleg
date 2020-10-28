package org.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRep extends CrudRepository<User,Integer> {

}
