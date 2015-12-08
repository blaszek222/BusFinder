/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.core.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;


/**
 *
 * @author Tutu
 */
@Entity
public class BusStop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bus_stop_id")
    private Integer id;
    @NotNull
    private String name;  
    @NotNull
    private float latitude;
    @NotNull
    private float longitude;
    
    @ManyToMany
    @JoinTable(name = "bus_line_bus_stop",
            joinColumns = @JoinColumn(name = "bus_stop"),
            inverseJoinColumns = @JoinColumn(name = "bus_line"))
    private List<BusLine> busLines;  
    
    public BusStop() {
        busLines = new ArrayList<>();
    }     

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BusLine> getBusLines() {
        return busLines;
    }

    public void setBusLines(List<BusLine> busLines) {
        this.busLines = busLines;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
    

