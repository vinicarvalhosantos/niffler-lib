package br.com.vinicius.santos.nifflerlib.models.dto;

import java.io.Serializable;
import java.util.List;

public class UserMessageDto implements Serializable {

    private static final long serialVersionUID = -969841145487728630L;

    private String message;

    private String username;

    private String displayName;

    private Long userId;

    private boolean subscriber;

    private int subscriptionTime;

    private int subscriptionTier = 0;

    private boolean emoteOnly;

    private List<String> emotes;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public boolean isSubscriber() {
        return subscriber;
    }

    public void setSubscriber(boolean subscriber) {
        this.subscriber = subscriber;
    }

    public int getSubscriptionTime() {
        return subscriptionTime;
    }

    public void setSubscriptionTime(int subscriptionTime) {
        this.subscriptionTime = subscriptionTime;
    }

    public int getSubscriptionTier() {
        return subscriptionTier;
    }

    public void setSubscriptionTier(int subscriptionTier) {
        this.subscriptionTier = subscriptionTier;
    }

    public boolean isEmoteOnly() {
        return emoteOnly;
    }

    public void setEmoteOnly(boolean emoteOnly) {
        this.emoteOnly = emoteOnly;
    }

    public List<String> getEmotes() {
        return emotes;
    }

    public void setEmotes(List<String> emotes) {
        this.emotes = emotes;
    }

    @Override
    public String toString() {
        return "UserMessageDto{" +
                "message='" + message + '\'' +
                ", username='" + username + '\'' +
                ", userId=" + userId +
                ", subscriber=" + subscriber +
                ", subscriptionTime=" + subscriptionTime +
                ", emoteOnly=" + emoteOnly +
                ", emotes=" + emotes +
                '}';
    }
}
