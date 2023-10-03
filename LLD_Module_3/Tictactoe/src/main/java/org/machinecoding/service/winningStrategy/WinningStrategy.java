package org.machinecoding.service.winningStrategy;

import org.machinecoding.models.Board;
import org.machinecoding.models.Move;
import org.machinecoding.models.Player;

public interface WinningStrategy {
    Player checkWinner(Board board, Move lastMove);
}
