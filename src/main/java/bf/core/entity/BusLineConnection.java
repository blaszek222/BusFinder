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
public class BusLineConnection {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bus_line_connection_id")
    private Integer id;
    
    @OneToOne
    @JoinColumn(name = "bus_line")
    private BusLine busLine;   
    
    @OneToOne
    @JoinColumn(name = "bus_stop_connection")
    private BusStopConnection busStopConnection;     
    
    @NotNull
    private Integer busLineOrder;

    public BusLineConnection() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BusLine getBusLine() {
        return busLine;
    }

    public void setBusLine(BusLine busLine) {
        this.busLine = busLine;
    }

    public BusStopConnection getBusStopConnection() {
        return busStopConnection;
    }

    public void setBusStopConnection(BusStopConnection busStopConnection) {
        this.busStopConnection = busStopConnection;
    }

    public Integer getBusLineOrder() {
        return busLineOrder;
    }

    public void setBusLineOrder(Integer busLineOrder) {
        this.busLineOrder = busLineOrder;
    }


    
    
}
