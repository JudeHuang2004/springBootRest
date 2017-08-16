package springBootRest.controller;
 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springBootRest.pojo.User;
import springBootRest.services.UserService;
 
 
@RestController
@RequestMapping("/userservice")
public class UserServiceController {
 
    @RequestMapping("/user/{id}")
    public ResponseEntity<?> getUser(@PathVariable("id") String id) {
    	System.out.println("Fetching User with id {}: "+ id);
    	User user = UserService.getUser(id);
        if (user == null) {
        	System.out.println("User with id {} not found: "+id);
            return new ResponseEntity<String>("User not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
 
}
