package org.machinecoding.service.botPlayingStrategy;

import org.machinecoding.exceptions.GameOverException;
import org.machinecoding.models.Board;
import org.machinecoding.models.Cell;
import org.machinecoding.models.CellState;
import org.machinecoding.models.Move;

import java.util.List;

public class RandomBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board) throws GameOverException {
        List<List<Cell>> matrix = board.getBoard();
        for(int i = 0; i < matrix.size(); i++){
            for(int j = 0; j < matrix.get(0).size(); j++){
                if(matrix.get(i).get(j).getCellState().equals(CellState.EMPTY)){
                    return new Move(i,j);
                }
            }
        }
        throw new GameOverException("Game Over!!...");
    }
}
