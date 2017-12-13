package com.botscrew.bot.model.button;

import com.botscrew.bot.model.button.addition.GameMetaData;

public class ButtonGamePlay {

    private final String type = "game_play";
    private String title;
    private String payload;
    private GameMetaData game_metadata;

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public GameMetaData getGame_metadata() {
        return game_metadata;
    }

    public void setGame_metadata(GameMetaData game_metadata) {
        this.game_metadata = game_metadata;
    }

    public ButtonGamePlay() {

    }

    public ButtonGamePlay(String title, String payload, GameMetaData game_metadata) {

        this.title = title;
        this.payload = payload;
        this.game_metadata = game_metadata;
    }
}
