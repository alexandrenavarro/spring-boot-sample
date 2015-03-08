package com.github.alexandrenavarro.springbootsample;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.alexandrenavarro.springbootsample.persistence.InstrumentRepository;

/**
 * <p>SpringBootSampleAppTest.</p>
 *
 * @author anavarro - Mar 8, 2015
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootSampleApp.class)
public class SpringBootSampleAppTest {

    
    @Autowired
    private InstrumentRepository instrumentRepository;
    
    @Test
    public void test() {
        assertThat(instrumentRepository).isNotNull();
    }

}
