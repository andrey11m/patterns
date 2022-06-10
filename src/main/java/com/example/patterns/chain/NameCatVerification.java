package com.example.patterns.chain;

import com.example.patterns.exception.UnVerifyCatException;
import org.springframework.stereotype.Component;

@Component
public class NameCatVerification implements CatVerification {
    @Override
    public void verify(CatDTO catDTO) {
        if (catDTO.getName().length() < 2) {
            throw new UnVerifyCatException("The name of the cat isn't verified");
        }
    }
}
