package com.example.patterns.state;

public class EndGameState implements GameState {
    @Override
    public void newGame(GameService gameService) {
        gameService.setGameState(new NewGameState());
        gameService.getGameState().newGame(gameService);
    }

    @Override
    public void runningGame(GameService gameService, String firstFigure) {
        gameService.setGameState(new RunningGameState());
        gameService.getGameState().runningGame(gameService, firstFigure);
    }

    @Override
    public void endGame(GameService gameService) {
        if (gameService.getFirstFigure().equals(gameService.getSecondFigure())) {
            gameService.setConclusion("Draw");
            gameService.setGameState(new NewGameState());
        } else {
            String stone = "stone";
            String paper = "paper";
            String scissors = "scissors";
            String loser = "You are loser!";
            String winner = "You are winner!";
            if (gameService.getFirstFigure().equals(stone) && gameService.getSecondFigure().equals(paper)) {
                gameService.setConclusion(loser);
                gameService.setGameState(new NewGameState());
            }
            if (gameService.getFirstFigure().equals(stone) && gameService.getSecondFigure().equals(scissors)) {
                gameService.setConclusion(winner);
                gameService.setGameState(new NewGameState());
            }
            if (gameService.getFirstFigure().equals(paper) && gameService.getSecondFigure().equals(scissors)) {
                gameService.setConclusion(loser);
                gameService.setGameState(new NewGameState());
            }
            if (gameService.getFirstFigure().equals(paper) && gameService.getSecondFigure().equals(stone)) {
                gameService.setConclusion(winner);
                gameService.setGameState(new NewGameState());
            }
            if (gameService.getFirstFigure().equals(scissors) && gameService.getSecondFigure().equals(stone)) {
                gameService.setConclusion(loser);
                gameService.setGameState(new NewGameState());
            }
            if (gameService.getFirstFigure().equals(scissors) && gameService.getSecondFigure().equals(paper)) {
                gameService.setConclusion(winner);
                gameService.setGameState(new NewGameState());
            }

        }
    }
}
