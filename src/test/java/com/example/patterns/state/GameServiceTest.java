package com.example.patterns.state;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class GameServiceTest {

    @InjectMocks
    private GameService gameService;

    @Test
    void run() {
        gameService.run("new");
        assertEquals("Unknown", gameService.getConclusion());
        gameService.run("stone");
        assertEquals("stone", gameService.getFirstFigure());
        assertNotNull(gameService.getSecondFigure());
    }
}