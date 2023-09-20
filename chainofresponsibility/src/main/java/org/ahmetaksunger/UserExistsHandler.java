package org.ahmetaksunger;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserExistsHandler extends BaseAuthHandler{

    private final Database database;

    @Override
    public boolean handle(String username, String password) {

        if(!database.hasUser(username)){
            throw new RuntimeException("User does not exist");
        }

        return handleNext(username, password);
    }
}
