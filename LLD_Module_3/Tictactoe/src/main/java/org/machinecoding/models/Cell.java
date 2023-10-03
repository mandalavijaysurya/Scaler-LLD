package org.machinecoding.models;

public class Cell {
    private int row;
    private int column;
    private CellState cellState;
    private Player player;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Cell(int i, int j) {
        this.row = i;
        this.column = j;
        this.cellState = CellState.EMPTY;
    }

    public void printCell(){
        if(cellState.equals(CellState.EMPTY)){
            System.out.print("| |");
        } else{
            System.out.print("|"+player.getSymbol()+"|");
        }
    }
}
