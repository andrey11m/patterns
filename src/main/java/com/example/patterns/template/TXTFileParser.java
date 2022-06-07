package com.example.patterns.template;

import org.springframework.stereotype.Component;

@Component
public class TXTFileParser extends FileParser {

    @Override
    protected void decode() {
        System.out.println("Decoding txt file...");
    }
}
