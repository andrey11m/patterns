package com.example.patterns.adapter;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Api(tags = "Adapter pattern controller")
public class MailController {
    private final MailService mailService;

    @GetMapping("/adapter/send")
    public void send() {
        mailService.sendMail();
    }
}
