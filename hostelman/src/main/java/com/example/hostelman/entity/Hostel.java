package com.example.hostelman.entity;
import com.example.hostelman.entity.Hostel;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "hostels")
public class Hostel {

    @Id
    private long id;

    @Column(nullable = false)
    private String name;
    private String location;

    public Hostel(){
    }

    public Hostel(long hostel_id, String name, String location) {
        this.id = hostel_id;
        this.name = name;
        this.location = location;
    }

    public long getHostel_id() {
        return id;
    }

    public void setHostel_id(long hostel_id) {
        this.id = hostel_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public String toString() {
        return "Hostel{" +
                "hostel_id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
//commit