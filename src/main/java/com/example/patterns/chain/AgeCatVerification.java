package com.example.patterns.chain;

import com.example.patterns.exception.UnVerifyCatException;
import org.springframework.stereotype.Component;

@Component
public class AgeCatVerification implements CatVerification {
    @Override
    public void verify(CatDTO catDTO) {
        if (catDTO.getAge() < 0) {
            throw new UnVerifyCatException("The age of the cat isn't verified");
        }
    }
}
