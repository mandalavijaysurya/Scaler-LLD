package org.machinecoding.service.botPlayingStrategy;

public class BotPlayingStrategyFactory {

    public BotPlayingStrategy getBotPlayingStrategy(){
        return new RandomBotPlayingStrategy();
    }
}
