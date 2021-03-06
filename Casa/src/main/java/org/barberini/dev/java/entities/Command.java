package org.barberini.dev.java.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="commands")
public class Command {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String device_id;
    private String command;
    private int ack;

    public Command() {
    }

    public Command(int id, String device_id, String command, int ack) {
        this.id = id;
        this.device_id = device_id;
        this.command = command;
        this.ack = ack;
    }

    public Command(String device_id, String command, int ack) {
        this.device_id = device_id;
        this.command = command;
        this.ack = ack;
    }

    public Command(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDevice_id() {
        return this.device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public String getCommand() {
        return this.command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public int getAck() {
        return this.ack;
    }

    public void setAck(int ack) {
        this.ack = ack;
    }
}