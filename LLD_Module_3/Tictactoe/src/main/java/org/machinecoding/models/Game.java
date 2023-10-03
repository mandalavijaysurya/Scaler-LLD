package org.machinecoding.models;

import org.machinecoding.exceptions.DuplicateSymbolAvailableException;
import org.machinecoding.exceptions.InvalidBoardDimension;
import org.machinecoding.exceptions.InvalidBotCountException;
import org.machinecoding.exceptions.InvalidPlayerCount;
import org.machinecoding.service.winningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move>  moves;
    private List<Board> boardStates;
    private Player winner;
    private Player currentPlayer;
    private GameStatus gameStatus;
    private WinningStrategy winningStrategy;

    public Game(Board board, List<Player> players, WinningStrategy winningStrategy) {
        this.board = board;
        this.players = players;
        this.moves = new ArrayList<>();
        this.boardStates = new ArrayList<>();
        this.gameStatus = GameStatus.IN_PROGRESS;
        this.winningStrategy = winningStrategy;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private int dimension;
        private List<Player> players;
        private WinningStrategy winningStrategy;

        public Builder board(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder players(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder winningStrategy(WinningStrategy winningStrategy) {
            this.winningStrategy = winningStrategy;
            return this;
        }

        public void validateBotCount() throws InvalidBotCountException{
            long count = players.stream().filter(n -> n.getPlayerType().equals(PlayerType.BOT)).count();
            if(count > 1L)
                throw new InvalidBotCountException("Current count of bot is greater than 1, current count is "+ count);
        }

        public void validateBoardSize() throws InvalidBoardDimension{
            if(dimension < 3 || dimension > 10)
                throw new InvalidBoardDimension("BBoard size should be not less than 3 and not greater than 10, but current board dimension is "+dimension);
        }

        public void validatePlayerCount() throws InvalidPlayerCount {
            if(players.size() != dimension-1)
                throw new InvalidPlayerCount("Number of players are not equal to dimension -1, current players count is "+players.size());
        }

        public void validateDuplicateSymbol() throws DuplicateSymbolAvailableException{
            HashSet<Character> symbols = new HashSet<>();
            players.forEach(n -> symbols.add(n.getSymbol()));
            if(symbols.size() != players.size())
                throw new DuplicateSymbolAvailableException("players have duplicate symbols");
        }

        public void validate() throws InvalidBoardDimension, InvalidBotCountException, DuplicateSymbolAvailableException, InvalidPlayerCount{
            validateBoardSize();
            validateBotCount();
            validateDuplicateSymbol();
            validatePlayerCount();
        }

        public Game build() throws InvalidBoardDimension, InvalidBotCountException, DuplicateSymbolAvailableException, InvalidPlayerCount{
            validate();
            return new Game(new Board(this.dimension), this.players, this.winningStrategy);
        }
    }
}
