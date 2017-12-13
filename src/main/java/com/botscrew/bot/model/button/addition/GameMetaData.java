package com.botscrew.bot.model.button.addition;

public class GameMetaData {

    private String player_id;
    private String context_id;

    public String getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(String player_id) {
        this.player_id = player_id;
    }

    public String getContext_id() {
        return context_id;
    }

    public void setContext_id(String context_id) {
        this.context_id = context_id;
    }

    public GameMetaData() {

    }

    public GameMetaData(String player_id, String context_id) {

        this.player_id = player_id;
        this.context_id = context_id;
    }
}
