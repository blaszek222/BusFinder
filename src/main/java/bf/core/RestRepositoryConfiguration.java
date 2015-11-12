/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.core;

import bf.core.entity.BusLine;
import bf.core.entity.BusLineConnection;
import bf.core.entity.BusStop;
import bf.core.entity.BusStopConnection;
import bf.core.entity.Timetable;
import org.springframework.boot.autoconfigure.data.rest.SpringBootRepositoryRestMvcConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

/**
 *
 * @author Tutu
 */
@Configuration
public class RestRepositoryConfiguration extends SpringBootRepositoryRestMvcConfiguration {

    @Override
    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(BusStop.class);
        config.exposeIdsFor(BusLine.class);
        config.exposeIdsFor(BusStopConnection.class);
        config.exposeIdsFor(BusLineConnection.class);
        config.exposeIdsFor(Timetable.class);        
        config.setReturnBodyOnCreate(true);
        config.setReturnBodyOnUpdate(true);
    }
}
