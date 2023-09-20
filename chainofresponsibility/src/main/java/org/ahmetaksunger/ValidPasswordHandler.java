package org.ahmetaksunger;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ValidPasswordHandler extends BaseAuthHandler{
        private final Database database;

        @Override
        public boolean handle(String username, String password) {

            if(!database.isValidPassword(username, password)){
                throw new RuntimeException("Invalid password");
            }

            return handleNext(username, password);
        }
}
