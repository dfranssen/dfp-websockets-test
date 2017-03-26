package be.ditavision.model.chat;

import java.util.Date;

/**
 * Created by dfranssen on 05/03/2017.
 */
public class ChatMessage {

    private String userId;
    private String fullName;
    private String message;
    private Date time;
    private String hostname;

    public ChatMessage() {
        this.time = new Date();
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "ChatMessage{" +
                "userId='" + userId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", message='" + message + '\'' +
                ", time=" + time +
                ", hostname='" + hostname + '\'' +
                '}';
    }
}
