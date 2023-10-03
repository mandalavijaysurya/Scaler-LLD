package org.machinecoding.service.winningStrategy;

import org.machinecoding.models.Board;
import org.machinecoding.models.Move;
import org.machinecoding.models.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneStrategy implements WinningStrategy{

    private int dimension;
    private List<HashMap<Character, Integer>> rowHashMaps;
    private List<HashMap<Character, Integer>> colHashMaps;
    private HashMap<Character, Integer> topLeftHashMap;
    private HashMap<Character, Integer> topRightHashMap;
    private HashMap<Character, Integer> cornerHashMap;

    public OrderOneStrategy(int dimension){
        this.dimension = dimension;
        this.rowHashMaps = new ArrayList<>();
        this.colHashMaps = new ArrayList<>();
        this.topLeftHashMap = new HashMap<>();
        this.topRightHashMap = new HashMap<>();
        this.cornerHashMap = new HashMap<>();
        for(int i = 0; i < dimension; i++){
            rowHashMaps.add(new HashMap<>());
            colHashMaps.add(new HashMap<>());
        }
    }

    public boolean isTopLeftCell(int row, int column){
        return row == column;
    }

    public boolean isTopRightCell(int row, int column){
        return row + column == dimension -1;
    }
    public boolean isCornerCell(int row, int column){
        if(row == 0 || row == dimension -1)
            return column == 0 || column == dimension -1;
        return false;
    }

    @Override
    public Player checkWinner(Board board, Move lastMove) {
        Player currentPlayer = lastMove.getPlayer();
        Character symbol = currentPlayer.getSymbol();
        int row = lastMove.getCell().getRow();
        int column = lastMove.getCell().getColumn();
        if (checkRowWin(row, symbol) || checkColumnWin(column, symbol)
                || checkCornerWin(row, column, symbol)
                || checkTopLeftWin(row, column, symbol)
                || checkTopRightWin(row, column, symbol)){
            return currentPlayer;
        }
        return null;
    }

    public boolean checkTopLeftWin(int row, int column, Character symbol){
        return isTopLeftCell(row, column) && topLeftHashMap.get(symbol).equals(dimension);
    }

    public boolean checkTopRightWin(int row, int column, Character symbol){
        return isTopRightCell(row, column) && topRightHashMap.get(symbol).equals(dimension);
    }
    public boolean checkRowWin(int row, Character symbol){
        return rowHashMaps.get(row).get(symbol).equals(dimension);
    }

    public boolean checkColumnWin(int column, Character symbol){
        return colHashMaps.get(column).get(symbol).equals(dimension);
    }

    public boolean checkCornerWin(int row, int column, Character symbol){
        return isCornerCell(row, column) && cornerHashMap.get(symbol).equals(dimension);
    }

}
