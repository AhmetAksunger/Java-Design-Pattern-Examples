package org.ahmetaksunger;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private Map<String,String> users = new HashMap<>();

    public Database(){
        users.put("ADMIN_user","admin_password");
        users.put("USER_john","user_password");
    }

    public boolean hasUser(String username){
        return users.containsKey(username);
    }

    public boolean isValidPassword(String username, String password){
        return users.get(username).equals(password);
    }

}
