package org.ahmetaksunger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AuthService {

    private final BaseAuthHandler handler;

    public AuthService(BaseAuthHandler handler) {
        this.handler = handler;
    }

    public void authenticate(String username, String password) {
        if (handler.handle(username, password)) {
            log.info("User {} is authenticated", username);
        }else {
            log.info("User {} is not authenticated", username);
        }
    }
}
