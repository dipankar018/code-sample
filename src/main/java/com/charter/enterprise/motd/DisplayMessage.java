package com.charter.enterprise.motd;

import org.springframework.stereotype.Component;

@Component
class DisplayMessage {
    private String message = "Welcome to Charter.  All systems are nominal.";

    String getMessage() {
        return message;
    }

    void setMessage(String mess) {
        message = mess;
    }
}
