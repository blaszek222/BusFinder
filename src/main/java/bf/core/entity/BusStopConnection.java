/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Tutu
 */

@Entity
public class BusStopConnection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bus_stop_connection_id")
    private Integer id;
    
    @NotNull
    private Integer distance;
    
    @OneToOne
    @JoinColumn(name = "bus_stop_from")
    private BusStop busStopFrom;   
    
    @OneToOne
    @JoinColumn(name = "bus_stop_to")
    private BusStop busStopTo;     

    public BusStopConnection() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
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
    
}
