package com.example.Movie.RestAPI;
import java.util.Optional;
import java.util.Set;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import com.example.Movie.Users.User;
import com.example.Movie.Users.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




@RestController
public class EndPoints {
   
    @Autowired
    private UserRepo userRepository;
    
@RequestMapping("/")
public @ResponseBody String test(){
    return "test";
}

@RequestMapping("/html")
public String htmlTest(){
    return "test";}



@PutMapping("/newuser")
public @ResponseBody User newUser(@RequestParam String username, @RequestParam String password){
    User user = new User(username, password);
    userRepository.save(user);
    return user;
}

@GetMapping("/getusers")
public @ResponseBody Iterable<User> getAllUsers(){
    return userRepository.findAll();
}

}
