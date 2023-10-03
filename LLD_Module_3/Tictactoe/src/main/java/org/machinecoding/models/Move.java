package org.machinecoding.models;

public class Move {
    private Cell cell;
    private Player player;

    public Move(){

    }
    public Move(int i, int j){
        this.cell = new Cell(i, j);
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
