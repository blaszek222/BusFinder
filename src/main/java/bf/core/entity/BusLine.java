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
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Tutu
 */
@Entity
public class BusLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bus_line_id")
    private Integer id;
    @NotNull
    private String number;  

    @OneToOne
    @JoinColumn(name = "bus_stop_from")
    private BusStop busStopFrom;    

    @OneToOne
    @JoinColumn(name = "bus_stop_to")
    private BusStop busStopTo;    
    
    @ManyToMany
    @JoinTable(name = "bus_line_bus_stop",
            joinColumns = @JoinColumn(name = "bus_line"),
            inverseJoinColumns = @JoinColumn(name = "bus_stop"))
    private List<BusStop> busStops; 
    
    public BusLine() {
        busStops = new ArrayList<>();
    }    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BusStop getBusStopFrom() {
        return busStopFrom;
    }

    public void setBusStopFrom(BusStop busStopFrom) {
        this.busStopFrom = busStopFrom;
    }

    public BusStop getBusStopTo() {
        return busStopTo;
    }

    public void setBusStopTo(BusStop busStopTo) {
        this.busStopTo = busStopTo;
    }

    public List<BusStop> getBusStops() {
        return busStops;
    }

    public void setBusStops(List<BusStop> busStops) {
        this.busStops = busStops;
    }

    
}
    

