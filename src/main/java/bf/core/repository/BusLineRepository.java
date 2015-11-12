/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.core.repository;

import bf.core.entity.BusLine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Tutu
 */
@RepositoryRestResource
public interface BusLineRepository extends CrudRepository<BusLine, Integer> {
    
}