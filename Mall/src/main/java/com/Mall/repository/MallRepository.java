package com.Mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Mall.entity.Mall;

@Repository
public interface MallRepository extends JpaRepository<Mall, Integer>{

}
