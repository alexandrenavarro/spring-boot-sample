package com.github.alexandrenavarro.springbootsample.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




/**
 * <p>InstrumentDomain.</p>
 *
 * @author anavarro - Mar 8, 2015
 *
 */
@Entity
public class Instrument {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String label;
    
    
    /**
     * Constructor.
     *
     */
    public Instrument() {
        
    }


    /**
     * Returns the id.
     *
     * @return The id to return.
     */
    public Long getId() {
        return this.id;
    }


    /**
     * Sets the id.
     *
     * @param aId The id to set.
     */
    public void setId(Long aId) {
        this.id = aId;
    }


    /**
     * Returns the code.
     *
     * @return The code to return.
     */
    public String getCode() {
        return this.code;
    }


    /**
     * Sets the code.
     *
     * @param aCode The code to set.
     */
    public void setCode(String aCode) {
        this.code = aCode;
    }


    /**
     * Returns the label.
     *
     * @return The label to return.
     */
    public String getLabel() {
        return this.label;
    }


    /**
     * Sets the label.
     *
     * @param aLabel The label to set.
     */
    public void setLabel(String aLabel) {
        this.label = aLabel;
    }
    
    

}
