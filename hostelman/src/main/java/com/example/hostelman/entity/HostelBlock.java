package com.example.hostelman.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "hostel_blocks")
public class HostelBlock {

    @Id
    private long hostel_id;

    @Column(nullable = false)
    private String name;

    @Column(length = 255)
    private String description;

    public HostelBlock(){
    }

    public HostelBlock(long hostel_id, String name, String description) {
        this.hostel_id = hostel_id;
        this.name = name;
        this.description = description;
    }

    public long getBlock_id() {
        return hostel_id;
    }

    public void setBlock_id(long block_id) {
        this.hostel_id = hostel_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "HostelBlock{" +
                "block_id=" + hostel_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
