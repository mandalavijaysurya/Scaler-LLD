package org.machinecoding.service.winningStrategy;

import org.machinecoding.models.Board;

public class WinningStrategyFactory {
    public WinningStrategy getWinningStrategy(WinningStrategies winningStrategies, int dimension){
        return new OrderOneStrategy(dimension);
    }
}
