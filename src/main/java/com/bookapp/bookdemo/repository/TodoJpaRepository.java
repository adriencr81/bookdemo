package com.bookapp.bookdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookapp.bookdemo.bean.Todo;

@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long>{
	List<Todo> findByUsername(String username);
}
