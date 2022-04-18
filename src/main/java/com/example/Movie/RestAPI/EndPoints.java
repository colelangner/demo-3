package com.example.Movie.RestAPI;
import java.util.Optional;
import java.util.Set;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
public class EndPoints {

    
@RequestMapping("/")
public @ResponseBody String test(){
    return "morgan smells like shit";
}



}
