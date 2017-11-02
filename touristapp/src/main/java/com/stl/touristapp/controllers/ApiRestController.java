package com.stl.touristapp.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stl.touristapp.pojo.User;
import com.stl.touristapp.services.UserService;

@RestController
public class ApiRestController {
	Logger logger = Logger.getLogger(ApiRestController.class);
	@Autowired
    UserService userService;  
//	@Autowired
//	private SampleJmsMessageSender messageProducer;
	//-------------------Retrieve All Users--------------------------------------------------------
    
    @RequestMapping(value = "/api/users", method = RequestMethod.GET)
    public ResponseEntity<List<User>> listAllUsers(HttpServletRequest httpRequest) {
//    	messageProducer.simpleSend();//jms test
    	System.out.println("@@@ host:"+httpRequest.getHeader("Host"));
        List<User> users = userService.findAllUsers();
        if(users.isEmpty()){
            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
  
  
    //-------------------Retrieve Single User--------------------------------------------------------
//    @PreAuthorize("hasRole('ADMIN')")  
    @RequestMapping(value = "/api/users/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<User> getUser(@PathVariable("id") long id) {
        System.out.println("Fetching User with id " + id);
        User user = userService.findByLoyaltyId(id);
        if (user == null) {
            System.out.println("User with id " + id + " not found");
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
    
}
