package com.example.Movie.Users;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, String> {
    
}
