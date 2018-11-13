package com.smarthome.IoTsmarthome.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Water Consumers")
public class water_consumers extends consumers {
    private Double power_usage;
    private Double water_usage;

    public Double getPower_usage() {
        return power_usage;
    }

    public void setPower_usage(Double power_usage) {
        this.power_usage = power_usage;
    }

    public Double getWater_usage() {
        return water_usage;
    }

    public void setWater_usage(Double water_usage) {
        this.water_usage = water_usage;
    }

    @Override
    public String toString() {
        return "water_consumers{" + super.toString() +
                "power_usage=" + power_usage +
                ", water_usage=" + water_usage +
                '}';
    }
}
