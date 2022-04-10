package com.midt.java;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachersRepository extends CrudRepository<Teachers, Integer> {

}

