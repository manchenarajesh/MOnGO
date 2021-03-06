package project.finalyear.init;

import android.location.Location;

public class Offer {

    private Location location;
    private String notification_Message;
    private String category;

    public Offer(Location location, String notification_message, String category) {
        this.location = location;
        this.notification_Message = notification_message;
        this.category = category;
    }

    public Location getLocation() {
        return location;
    }

    public String getNotification_Message() {
        return notification_Message;
    }

    public String getCategory() {
        return category;
    }
}
