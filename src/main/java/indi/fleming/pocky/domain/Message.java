package indi.fleming.pocky.domain;

import org.springframework.stereotype.Component;

@Component
public class Message {

    private String messageState;
    private String messageData;

    public String getMessageState() {
        return messageState;
    }

    public void setMessageState(String messageState) {
        this.messageState = messageState;
    }

    public String getMessageData() {
        return messageData;
    }

    public void setMessageData(String messageData) {
        this.messageData = messageData;
    }
}
