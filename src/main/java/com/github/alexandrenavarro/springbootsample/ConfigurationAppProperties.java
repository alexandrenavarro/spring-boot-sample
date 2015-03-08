package com.github.alexandrenavarro.springbootsample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>ConfigurationProperties.</p>
 *
 * @author anavarro - Mar 7, 2015
 *
 */
@ConfigurationProperties(prefix="last")
public class ConfigurationAppProperties {


    private List<String> servers = new ArrayList<String>();

    /**
     * Returns the servers.
     *
     * @return The servers to return.
     */
    public List<String> getServers() {
        return this.servers;
    }
    
    
}
