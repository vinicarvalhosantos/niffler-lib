package br.com.vinicius.santos.nifflerlib.model;

import java.util.List;

public class TwitchUserModel {

    private List<TwitchUserModelData> data;

    public List<TwitchUserModelData> getData() {
        return data;
    }

    public void setData(List<TwitchUserModelData> data) {
        this.data = data;
    }
}

