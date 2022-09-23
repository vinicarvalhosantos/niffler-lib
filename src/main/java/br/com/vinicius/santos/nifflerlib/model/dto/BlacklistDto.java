package br.com.vinicius.santos.nifflerlib.model.dto;

import java.io.Serializable;

public class BlacklistDto implements Serializable {

    private static final long serialVersionUID = -4868731603701352513L;

    private String username;

    public BlacklistDto() {
    }

    public BlacklistDto(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
