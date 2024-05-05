package domain;

import java.util.HashMap;
import java.util.List;

public class Flight {

    private String id;
    private String departureId;
    private String targetId;

    public Flight(String id, String departureId, String targetId) {
        this.id = id;
        this.departureId = departureId;
        this.targetId = targetId;
    }

    public String getDepartureId() {
        return this.departureId;

    }

    public String getTargetId() {
        return this.targetId;
    }

    public String getAirplane() {
        return this.id;
    }

    public String toString() {
        return this.id + "(" + this.departureId + "-" + this.targetId + ")";
    }


}
