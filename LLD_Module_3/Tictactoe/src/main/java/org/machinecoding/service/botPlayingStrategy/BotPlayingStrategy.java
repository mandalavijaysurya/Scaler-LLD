package org.machinecoding.service.botPlayingStrategy;

import org.machinecoding.exceptions.GameOverException;
import org.machinecoding.models.Board;
import org.machinecoding.models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board) throws GameOverException;
}
