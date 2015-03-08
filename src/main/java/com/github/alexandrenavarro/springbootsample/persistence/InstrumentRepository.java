package com.github.alexandrenavarro.springbootsample.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * <p>InstrumentRepository.</p>
 *
 * @author anavarro - Mar 8, 2015
 *
 */

@RepositoryRestResource
public interface InstrumentRepository  extends CrudRepository<Instrument, Long>  {
    
    
    
    public Instrument findByCode(@Param("code") String code);

}
