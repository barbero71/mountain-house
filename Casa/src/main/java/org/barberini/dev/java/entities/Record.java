package org.barberini.dev.java.entities;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="records")
public class Record {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private int device_id;
    private double temperature;
    private double humidity;
    private Timestamp time;

    public Record(int id, int device_id, double temperature, double humidity, Timestamp time) {
        this.id = id;
        this.device_id = device_id;
        this.temperature = temperature;
        this.humidity = humidity;
        this.time = time;
    }

    public Record(int device_id, double temperature, double humidity, Timestamp time) {
        this.device_id = device_id;
        this.temperature = temperature;
        this.humidity = humidity;
        this.time = time;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDevice_id() {
        return this.device_id;
    }

    public void setDevice_id(int device_id) {
        this.device_id = device_id;
    }

    public double getTemperature() {
        return this.temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return this.humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public Timestamp getTime() {
        return this.time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
}