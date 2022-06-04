package com.example.patterns.state;

public class NewGameState implements GameState {
    @Override
    public void newGame(GameService gameService) {
        gameService.setFirstFigure("");
        gameService.setSecondFigure("");
        gameService.setConclusion("Unknown");
    }

    @Override
    public void runningGame(GameService gameService, String firstFigure) {
        gameService.setGameState(new RunningGameState());
        gameService.getGameState().runningGame(gameService, firstFigure);
    }

    @Override
    public void endGame(GameService gameService) {
        gameService.setGameState(new EndGameState());
        gameService.getGameState().endGame(gameService);
    }
}
