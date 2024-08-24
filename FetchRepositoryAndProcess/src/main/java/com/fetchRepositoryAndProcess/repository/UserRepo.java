package com.fetchRepositoryAndProcess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fetchRepositoryAndProcess.entity.User;


@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	public User findByIdUserId(int id);
}
