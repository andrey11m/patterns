package com.example.patterns.chain;

import com.example.patterns.exception.UnVerifyCatException;
import org.springframework.stereotype.Component;

@Component
public class BreedCatVerification implements CatVerification {
    @Override
    public void verify(CatDTO catDTO) {
        if (catDTO.getBreed().length() < 3) {
            throw new UnVerifyCatException("The breed of the cat isn't verified");
        }
    }
}
