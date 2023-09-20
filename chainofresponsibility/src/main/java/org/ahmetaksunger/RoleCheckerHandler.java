package org.ahmetaksunger;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class RoleCheckerHandler extends BaseAuthHandler {

    @Override
    public boolean handle(String username, String password) {

        if (username.startsWith("ADMIN")) {
            log.info("User {} is an admin", username);
            return true;
        }
        log.info("User {} is not an admin", username);
        return handleNext(username, password);
    }
}
