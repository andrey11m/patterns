package com.example.patterns.state;

public interface GameState {
    void newGame(GameService gameService);

    void runningGame(GameService gameService, String firstFigure);

    void endGame(GameService gameService);
}
