package com.narjess.user.RESTController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.narjess.user.UserRepository;
import com.narjess.user.entities.User;

@RestController
@CrossOrigin(origins = "*")
public class UserRestController {
@Autowired
UserRepository userRep;
@RequestMapping(value ="/login/{username}",method = RequestMethod.GET)
public User getUserByUsernamePassword(@PathVariable("username") String 
username) {
return userRep.findByUsername(username);
}
}
