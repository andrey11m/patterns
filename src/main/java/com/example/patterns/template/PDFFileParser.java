package com.example.patterns.template;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class PDFFileParser extends FileParser {

    @Override
    protected void decode() {
        System.out.println("Decoding pdf file...");
    }
}
