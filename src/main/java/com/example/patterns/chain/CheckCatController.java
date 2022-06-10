package com.example.patterns.chain;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@Api(tags = "Chain of responsibility controller")
public class CheckCatController {

    @Autowired
    private List<CatVerification> verifications;

    @PostMapping("/chain/verify")
    public CatDTO catVerify(CatDTO catDTO) {
        verifications.forEach(verification -> verification.verify(catDTO));
        return catDTO;
    }
}
