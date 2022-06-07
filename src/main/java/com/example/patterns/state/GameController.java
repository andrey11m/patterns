package com.example.patterns.state;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "State pattern game controller")
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;

    @GetMapping("/state/{state}")
    public String game(@PathVariable String state) {
        gameService.run(state);
        return gameService.getConclusion();
    }
}
