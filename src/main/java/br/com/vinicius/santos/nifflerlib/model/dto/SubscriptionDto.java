package br.com.vinicius.santos.nifflerlib.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

public class SubscriptionDto implements Serializable {

    private static final long serialVersionUID = -1546579074054270503L;

    private String id;

    private String status;

    private String type;

    private String version;

    @JsonProperty("created_at")
    private Date createdAt;

    private int cost;

    public SubscriptionDto() {
    }

    public SubscriptionDto(String id, String status, String type, String version, Date createdAt, int cost) {
        this.id = id;
        this.status = status;
        this.type = type;
        this.version = version;
        this.createdAt = createdAt;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", version='" + version + '\'' +
                ", createdAt=" + createdAt +
                ", cost=" + cost +
                '}';
    }
}
