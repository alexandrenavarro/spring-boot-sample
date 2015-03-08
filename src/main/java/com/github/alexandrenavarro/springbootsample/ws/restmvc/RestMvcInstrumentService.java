package com.github.alexandrenavarro.springbootsample.ws.restmvc;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.alexandrenavarro.springbootsample.ConfigurationAppProperties;
import com.github.alexandrenavarro.springbootsample.persistence.Instrument;
import com.github.alexandrenavarro.springbootsample.persistence.InstrumentRepository;
import com.github.alexandrenavarro.springbootsample.ws.InstrumentDto;
import com.github.alexandrenavarro.springbootsample.ws.InstrumentService;

/**
 * <p>RestInstrumentService.</p>
 *
 * @author anavarro - Mar 7, 2015
 *
 *
 */

//@RestController
@RequestMapping(value = "/instrument")
@ManagedResource
public class RestMvcInstrumentService implements InstrumentService {

    private static final Logger        LOGGER = LoggerFactory.getLogger(RestMvcInstrumentService.class);

    private Map<String, InstrumentDto> map    = new ConcurrentHashMap<String, InstrumentDto>();

    @Value("${app.name}")
    private String                     name;
    
    @Value("${info.build.version}")
    private String                     version;

    private InstrumentRepository       instrumentRepository;

    // @Autowired
    private ConfigurationAppProperties configurationAppProperties;

    // private ConfigurationAppProperties configurationAppProperties;
    /**
     * Constructor.
     *
     */
    public RestMvcInstrumentService() {
        
    }
    
    public RestMvcInstrumentService(InstrumentRepository aInstrumentRepository) {
        final InstrumentDto instrument = new InstrumentDto("code", "label");
        this.map.put(instrument.getCode(), instrument);
        this.instrumentRepository = aInstrumentRepository;
        if (this.instrumentRepository != null) {
            final Instrument instrument1 = new Instrument();
            instrument1.setCode("myCode");
            instrument1.setLabel("myLabel");
            //this.instrumentRepository.save(instrument1);
        }
    }

    @RequestMapping("/name")
    String home() {
        return name;
        // return "Hello World!";
    }
    
    @RequestMapping("/version")
    String version() {
        return version;
        // return "Hello World!";
    }
    

    // @RequestMapping("/servers")
    // List<String> getServers() {
    // return this.configurationAppProperties.getServers();
    // }

    @RequestMapping()
    public Collection<InstrumentDto> findAll() {
//        return StreamSupport.stream(this.instrumentRepository.findAll()
//            .spliterator(), false)
//            .map((instrument) -> {
//                return new InstrumentDto(instrument.getCode(), instrument.getLabel());
//            })
//            .collect(Collectors.toList());
        return Collections.emptyList();
        
    }

    @RequestMapping("/count")
    @ManagedOperation
    public long count() {
        //return this.instrumentRepository.count();
        return 0;
    }

    @RequestMapping("/{code}")
    public InstrumentDto findOne(@PathVariable String code) {
        return this.map.get(code);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public void save(@RequestBody InstrumentDto instrument) {
        LOGGER.info("instrument={}", instrument);
        this.map.put(instrument.getCode(), instrument);
    }

}
