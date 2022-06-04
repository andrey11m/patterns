package com.example.patterns.state;

import java.util.Random;

public class RunningGameState implements GameState {
    @Override
    public void newGame(GameService gameService) {
        gameService.setGameState(new NewGameState());
        gameService.getGameState().newGame(gameService);
    }

    @Override
    public void runningGame(GameService gameService, String firstFigure) {
        gameService.setFirstFigure(firstFigure);
        gameService.setSecondFigure(createSecondFigure());
        gameService.setGameState(new EndGameState());
        gameService.getGameState().endGame(gameService);
    }

    private String createSecondFigure() {
        Random random = new Random();
        int figureIndex = random.nextInt(3);
        return switch (figureIndex) {
            case 0 -> "stone";
            case 1 -> "scissors";
            case 2 -> "paper";
            default -> null;
        };
    }

    @Override
    public void endGame(GameService gameService) {
        gameService.setGameState(new EndGameState());
        gameService.getGameState().endGame(gameService);
    }
}
