package com.company.singleresp;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
/*
 * 1) Getting a request and creating a user
 * 2) Validating if user is valid
 * 3) Storing object in hashmap
 */
//Handles incoming JSON requests that work on User resource/entity from client
public class UserController {
	//Store used by controller
    //private Store store = new Store(); incorrect, create a seperate class to handle storage
    private UserPersistenceService service = new UserPersistenceService(); //correct way, having a sep class handle storage
    //Create a new user
    public String createUser(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(userJson, User.class);

        /* 
        if(!isValidUser(user)) { //incorrect, shouldnt bother with if user is valid.
            return "ERROR";
        } */

        UserValidator validator = new UserValidator();
        boolean valid =  validator.validateUser(user);

        if(!valid) { //correct way, having a sep class handle validation
            return "ERROR";
        } 

        //store.store(user);
        service.saveUser(user);
        
        
        return "SUCCESS";
    } 

    //Validates the user object, incorrect (breaking principle)
    /* 
    private boolean isValidUser(User user) {
        if(!isPresent(user.getName())) {
            return false;
        }
        user.setName(user.getName().trim());

        if(!isValidAlphaNumeric(user.getName())) {
            return false;
        }
        if(user.getEmail() == null || user.getEmail().trim().length() == 0) {
            return false;
        }
        user.setEmail(user.getEmail().trim());
        if(!isValidEmail(user.getEmail())) {
            return false;
        }
        return true;
    }
    
    //Simply checks if value is null or empty..
    private boolean isPresent(String value) {
        return value != null && value.trim().length() > 0;
    }
    //check string for special characters
    private boolean isValidAlphaNumeric(String value) {
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]"); 
        Matcher matcher = pattern.matcher(value);
        return !matcher.find();
    }
    //check string for valid email address - this is not for prod. 
    //Just for demo. This fails for lots of valid emails.
    private boolean isValidEmail(String value) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"); 
        Matcher matcher = pattern.matcher(value);
        return matcher.find();
    }
    */

}