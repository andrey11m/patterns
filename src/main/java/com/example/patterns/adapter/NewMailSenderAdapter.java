package com.example.patterns.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NewMailSenderAdapter implements NewMailSender {

    private final OldMailSender oldMailSender;

    @Override
    public void sendMail() {
        oldMailSender.sendMail();
    }
}
