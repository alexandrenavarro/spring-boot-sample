package com.github.alexandrenavarro.springbootsample.ws;

/**
 * <p>Instrument.</p>
 *
 * @author anavarro - Mar 7, 2015
 *
 */
public class InstrumentDto {

    private String code;
    private String label;

    /**
     * Constructor.
     *
     */
    public InstrumentDto() {
    }
    
    

    /**
     * Constructor.
     *
     * @param aCode
     * @param aLabel
     */
    public InstrumentDto(String aCode, String aLabel) {
        super();
        this.code = aCode;
        this.label = aLabel;
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

    /**
     * {@inheritDoc}
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.code == null) ? 0 : this.code.hashCode());
        result = prime * result + ((this.label == null) ? 0 : this.label.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        InstrumentDto other = (InstrumentDto) obj;
        if (this.code == null) {
            if (other.code != null)
                return false;
        } else if (!this.code.equals(other.code))
            return false;
        if (this.label == null) {
            if (other.label != null)
                return false;
        } else if (!this.label.equals(other.label))
            return false;
        return true;
    }

    /**
     * {@inheritDoc}
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Instrument [code=" + this.code + ", label=" + this.label + "]";
    }

}
