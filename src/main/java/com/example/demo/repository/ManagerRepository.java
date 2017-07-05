package com.example.demo.repository;

import com.example.demo.entity.Manager;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ManagerRepository extends CrudRepository<Manager,Integer>{
}
