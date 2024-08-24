package com.example.hostelman.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "rooms")
public class Room {

    @Id
    private long id;

    @Column(nullable = false)
    private int block_id;
    private int number;
    private String type;
    private int capacity;
    private String status;

    public Room(){
    }

    public Room(long id, int block_id, int number, String type, int capacity, String status) {
        this.id = id;
        this.block_id = block_id;
        this.number = number;
        this.type = type;
        this.capacity = capacity;
        this.status = status;
    }

    public long getRoom_id() {
        return id;
    }

    public void setRoom_id(long room_id) {
        this.id = room_id;
    }

    public int getBlock_id() {
        return block_id;
    }

    public void setBlock_id(int block_id) {
        this.block_id = block_id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", block_id=" + block_id +
                ", number=" + number +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                ", status='" + status + '\'' +
                '}';
    }
}
