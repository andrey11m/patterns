package com.example.patterns.adapter;

import org.springframework.stereotype.Component;

@Component
public class OldMailSenderImpl implements OldMailSender {
    @Override
    public void sendMail() {
        System.out.println("Sending email via old mail sender");
    }
}
