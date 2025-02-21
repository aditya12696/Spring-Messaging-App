package com.bridgelabz.getmethoduse;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // GET Request - Returns a hello message
    @GetMapping
    public String getHello() {
        return "Hello from BridgeLabz";
    }

    // POST Request - Accepts a name and returns a message
    @PostMapping
    public String postHello(@RequestBody String name) {
        return "Hello, " + name + "! Welcome to BridgeLabz.";
    }

    // PUT Request - Updates and returns a message
    @PutMapping
    public String putHello(@RequestBody String name) {
        return "Hello, " + name + "! Your data has been updated.";
    }

    // DELETE Request - Responds to a delete request
    @DeleteMapping
    public String deleteHello() {
        return "Hello from BridgeLabz! Your data has been deleted.";
    }
}
