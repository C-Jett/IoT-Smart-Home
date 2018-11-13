package com.smarthome.IoTsmarthome.model;

import java.util.Objects;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Electrical Consumers")
class electric_consumers extends consumers {
    private Double power_usage;

    public Double getPower_usage() {
        return power_usage;
    }

    public void setPower_usage(Double power_usage) {
        this.power_usage = power_usage;
    }

    @Override
    public String toString() {
        return "electric_consumers{" +
                super.toString() +
                "power_usage=" + power_usage +
                '}';
    }
}
