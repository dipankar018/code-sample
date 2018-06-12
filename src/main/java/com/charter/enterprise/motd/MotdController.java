package com.charter.enterprise.motd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/")
@RestController
public class MotdController {

    @Autowired
    private DisplayMessage displayMessage;

    @GetMapping
    public String getMotd() {
        return displayMessage.getMessage();
    }

    @PutMapping("/message/{mess}")
    public  void updateMessage(@PathVariable String mess) {
        displayMessage.setMessage(mess);
    }
}