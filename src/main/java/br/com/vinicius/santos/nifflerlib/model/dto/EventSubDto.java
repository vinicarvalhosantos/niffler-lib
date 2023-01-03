package br.com.vinicius.santos.nifflerlib.model.dto;


import java.io.Serializable;

public class EventSubDto implements Serializable {

    private static final long serialVersionUID = -4063071989794619824L;

    private SubscriptionDto subscription;

    private EventDto event;

    public EventSubDto() {
    }

    public EventSubDto(SubscriptionDto subscription, EventDto event) {
        this.subscription = subscription;
        this.event = event;
    }

    public SubscriptionDto getSubscription() {
        return subscription;
    }

    public void setSubscription(SubscriptionDto subscription) {
        this.subscription = subscription;
    }

    public EventDto getEvent() {
        return event;
    }

    public void setEvent(EventDto event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "EventSubDto{" +
                "subscription=" + subscription +
                ", event=" + event +
                '}';
    }
}


