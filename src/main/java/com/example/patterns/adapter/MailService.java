package com.example.patterns.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailService {

    private final NewMailSender newMailSender;

    public void sendMail() {
        System.out.println("Starting sending mail...");
        newMailSender.sendMail();
        System.out.println("Email was sent");
    }

}
