package com.capitallux.contact;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {

    @PostMapping("/submitContact")
    public ResponseEntity<String> submitContact(@RequestBody ContactForm contactForm) {
        // Process or save the contact form
        System.out.println("New Contact Submission: " + contactForm);
        return ResponseEntity.ok("Thanks for contacting us, " + contactForm.getName() + "!");
    }

}