/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.core.entity;

import java.sql.Time;
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
public class Timetable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "timetable_id")
    private Integer id;
    
    @OneToOne
    @JoinColumn(name = "bus_line")
    private BusLine busLine; 
    
    @OneToOne
    @JoinColumn(name = "bus_stop")
    private BusStop busStop;
    
    @NotNull
    private Integer time_hour;
    
    @NotNull
    private Integer time_minute;    

    public Timetable() {
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

    public BusStop getBusStop() {
        return busStop;
    }

    public void setBusStop(BusStop busStop) {
        this.busStop = busStop;
    }

    public Integer getTime_hour() {
        return time_hour;
    }

    public void setTime_hour(Integer time_hour) {
        this.time_hour = time_hour;
    }

    public Integer getTime_minute() {
        return time_minute;
    }

    public void setTime_minute(Integer time_minute) {
        this.time_minute = time_minute;
    }
    
}
