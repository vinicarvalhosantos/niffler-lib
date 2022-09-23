package br.com.vinicius.santos.nifflerlib.model;

import java.io.Serializable;

public class TwitchTokenModel implements Serializable {

    private static final long serialVersionUID = -221258559163507349L;
    private String access_token;

    private Long expires_in;

    private String token_type;

    public TwitchTokenModel() {
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public Long getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(Long expires_in) {
        this.expires_in = expires_in;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }
}
