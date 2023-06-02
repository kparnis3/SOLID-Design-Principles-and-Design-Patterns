package com.company.singleresp;

import java.util.HashMap;
import java.util.Map;

//Stores data in memory
public class Store {

	//String -> UserName
    private static final Map<String, User> STORAGE = new HashMap<>();
    //Adds user to in memory hash map
    public void store(User user) {
        /*
         * A piece of logic marked with synchronized becomes a synchronized block, 
         * allowing only one thread to execute at any given time
         */
        synchronized(STORAGE) { //synchronizing thread access to shared data
            STORAGE.put(user.getName(), user);
        }
    }
    //Returns used with given id if present in map else null
    public User getUser(String name) {
        synchronized(STORAGE) {
            return STORAGE.get(name);
        }
    }
}