package com.example.patterns.state;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
@ToString
public class GameService {

    private String firstFigure;
    private String secondFigure;
    private GameState gameState;
    private String conclusion;

    public GameService() {
        gameState = new NewGameState();
    }

    public void run(String state) {
        switch (state) {
            case "new" -> gameState.newGame(this);
            case "stone", "scissors", "paper" -> gameState.runningGame(this, state);
            default -> throw new IllegalStateException("Unexpected value: " + state);
        }
    }

}
