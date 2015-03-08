package com.github.alexandrenavarro.springbootsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.alexandrenavarro.springbootsample.ws.InstrumentService;
import com.github.alexandrenavarro.springbootsample.ws.restmvc.RestMvcInstrumentService;
import com.github.alexandrenavarro.springbootsample.ws.restmvc.RestMvcTestService;

/**
 * <p>Application.</p>
 *
 * @author anavarro - Mar 7, 2015
 *
 */

@Configuration
@EnableAutoConfiguration
// @EnableAutoConfiguration(exclude={HibernateJpaAutoConfiguration.class, DataSourceAutoConfiguration.class})

// To know /autoconfig 

// @Import(value = { AuditAutoConfiguration.class,
// EndpointAutoConfiguration.class, EndpointMBeanExportAutoConfiguration.class,
// EndpointWebMvcAutoConfiguration.class, HealthIndicatorAutoConfiguration.class, ManagementServerPropertiesAutoConfiguration.class,
// MetricFilterAutoConfiguration.class, PublicMetricsAutoConfiguration.class, TraceRepositoryAutoConfiguration.class,
// TraceWebFilterAutoConfiguration.class, PropertyPlaceholderAutoConfiguration.class, AopAutoConfiguration.class,
// PersistenceExceptionTranslationAutoConfiguration.class, JpaRepositoriesAutoConfiguration.class, SpringDataWebAutoConfiguration.class,
// JacksonAutoConfiguration.class, DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class,
// JmxAutoConfiguration.class, JtaAutoConfiguration.class, HibernateJpaAutoConfiguration.class, /* JpaBaseConfiguration.class, */
// DispatcherServletAutoConfiguration.class, EmbeddedServletContainerAutoConfiguration.class, ErrorMvcAutoConfiguration.class,
// HttpEncodingAutoConfiguration.class, HttpEncodingAutoConfiguration.class, HttpMessageConvertersAutoConfiguration.class,
// /*JacksonHttpMessageConvertersConfiguration.class,*/ MultipartAutoConfiguration.class, ServerPropertiesAutoConfiguration.class,
// WebMvcAutoConfiguration.class, WebSocketAutoConfiguration.class })


// Persistence
// @Import(value = {
//AopAutoConfiguration.class, PersistenceExceptionTranslationAutoConfiguration.class, JpaRepositoriesAutoConfiguration.class,
//        SpringDataWebAutoConfiguration.class, DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class,
//        JtaAutoConfiguration.class, HibernateJpaAutoConfiguration.class, EmbeddedServletContainerAutoConfiguration.class })
//

// Actuator
//  @Import(value = { AuditAutoConfiguration.class,
//EndpointAutoConfiguration.class, EndpointMBeanExportAutoConfiguration.class,
//EndpointWebMvcAutoConfiguration.class, HealthIndicatorAutoConfiguration.class, ManagementServerPropertiesAutoConfiguration.class,
//MetricFilterAutoConfiguration.class, PublicMetricsAutoConfiguration.class, TraceRepositoryAutoConfiguration.class,
//TraceWebFilterAutoConfiguration.class


// Web
//@Import(value = { TestConfig.class,
// PropertyPlaceholderAutoConfiguration.class, AopAutoConfiguration.class,
//SpringDataWebAutoConfiguration.class,
//DispatcherServletAutoConfiguration.class, EmbeddedServletContainerAutoConfiguration.class, ErrorMvcAutoConfiguration.class,
//HttpEncodingAutoConfiguration.class, HttpEncodingAutoConfiguration.class, HttpMessageConvertersAutoConfiguration.class,
// MultipartAutoConfiguration.class, ServerPropertiesAutoConfiguration.class,
//WebMvcAutoConfiguration.class, WebSocketAutoConfiguration.class })


// Web mini

//@Import(value = { TestConfig.class,
//        PropertyPlaceholderAutoConfiguration.class, 
//        //AopAutoConfiguration.class,
//       //SpringDataWebAutoConfiguration.class,
//       DispatcherServletAutoConfiguration.class, 
//       EmbeddedServletContainerAutoConfiguration.class, 
//       //ErrorMvcAutoConfiguration.class,
//       //HttpEncodingAutoConfiguration.class, 
//       HttpMessageConvertersAutoConfiguration.class,
//       //MultipartAutoConfiguration.class, 
//       ServerPropertiesAutoConfiguration.class,
//       WebMvcAutoConfiguration.class//, 
//       //WebSocketAutoConfiguration.class 
//       })


// Web mini
// @Import({ EmbeddedServletContainerAutoConfiguration.class,
// DispatcherServletAutoConfiguration.class,
// ServerPropertiesAutoConfiguration.class, WebMvcAutoConfiguration.class,
// HttpMessageConvertersAutoConfiguration.class,
// PropertyPlaceholderAutoConfiguration.class })
public class SpringBootSampleApp {
    
    @Configuration
    public static class TestConfig {
        @Bean
        InstrumentService restInstrumentService() {
        return new RestMvcInstrumentService(null);
        }
        
        @Bean RestMvcTestService restTestService() {
            return new RestMvcTestService();
        }
    }

    // @Bean
    // @Primary
    // public InstrumentRepository instrumentRepository() {
    // return Mockito.mock(InstrumentRepository.class);
    // }

    // @Bean
    // InstrumentResource restInstrumentService(InstrumentRepository instrumentRepository) {
    // return new RestInstrumentService(instrumentRepository);
    // }

     @Bean
     InstrumentService restInstrumentService() {
     return new RestMvcInstrumentService(null);
     }

    /**
     * Constructor.
     *
     */
    public SpringBootSampleApp() {
        // TODO Auto-generated constructor stub

    }

    /**
     * <p>main.</p>
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootSampleApp.class, args);
    }

}
