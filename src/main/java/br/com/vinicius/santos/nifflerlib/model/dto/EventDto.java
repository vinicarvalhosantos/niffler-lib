package br.com.vinicius.santos.nifflerlib.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

public class EventDto implements Serializable {

    private static final long serialVersionUID = 6801725519248826596L;

    private Long userId;

    @JsonProperty("user_login")
    private String userLogin;

    @JsonProperty("user_name")
    private String userName;

    @JsonProperty("broadcaster_user_id")
    private long broadcasterUserId;

    @JsonProperty("broadcaster_user_login")
    private String broadcasterUserLogin;

    @JsonProperty("broadcaster_user_name")
    private String broadcasterUserName;

    private String title;

    private String language;

    @JsonProperty("category_id")
    private Long categoryId;

    @JsonProperty("category_name")
    private String categoryName;

    private String type;

    @JsonProperty("started_at")
    private Date startedAt;

    public EventDto() {
    }

    public EventDto(Long userId, String userLogin, String userName, long broadcasterUserId, String broadcasterUserLogin, String broadcasterUserName, String title, String language, Long categoryId, String categoryName, String type, Date startedAt) {
        this.userId = userId;
        this.userLogin = userLogin;
        this.userName = userName;
        this.broadcasterUserId = broadcasterUserId;
        this.broadcasterUserLogin = broadcasterUserLogin;
        this.broadcasterUserName = broadcasterUserName;
        this.title = title;
        this.language = language;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.type = type;
        this.startedAt = startedAt;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getBroadcasterUserId() {
        return broadcasterUserId;
    }

    public void setBroadcasterUserId(long broadcasterUserId) {
        this.broadcasterUserId = broadcasterUserId;
    }

    public String getBroadcasterUserLogin() {
        return broadcasterUserLogin;
    }

    public void setBroadcasterUserLogin(String broadcasterUserLogin) {
        this.broadcasterUserLogin = broadcasterUserLogin;
    }

    public String getBroadcasterUserName() {
        return broadcasterUserName;
    }

    public void setBroadcasterUserName(String broadcasterUserName) {
        this.broadcasterUserName = broadcasterUserName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    @Override
    public String toString() {
        return "EventDto{" +
                "userId=" + userId +
                ", userLogin='" + userLogin + '\'' +
                ", userName='" + userName + '\'' +
                ", broadcasterUserId=" + broadcasterUserId +
                ", broadcasterUserLogin='" + broadcasterUserLogin + '\'' +
                ", broadcasterUserName='" + broadcasterUserName + '\'' +
                ", title='" + title + '\'' +
                ", language='" + language + '\'' +
                ", categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", type='" + type + '\'' +
                ", startedAt=" + startedAt +
                '}';
    }
}
