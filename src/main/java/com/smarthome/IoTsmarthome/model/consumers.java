package com.smarthome.IoTsmarthome.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name="Consumers")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class consumers {
    @Id
    private long uniq_id;
    private long room_id;
    private Time time_stamp;
    private String room_name;
    private Boolean state;
    private String item_name;

    public consumers(){ super();}

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public long getUniq_id() {
        return uniq_id;
    }

    public void setUniq_id(long uniq_id) {
        this.uniq_id = uniq_id;
    }

    public long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(long room_id) {
        this.room_id = room_id;
    }

    public Time getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(Time time_stamp) {
        this.time_stamp = time_stamp;
    }

    @Override
    public String toString() {
        return "consumers{" +
                "uniq_id=" + uniq_id +
                ", room_id=" + room_id +
                ", time stamp=" + time_stamp +
                '}';
    }
}
