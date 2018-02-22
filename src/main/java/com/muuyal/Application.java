package com.muuyal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import com.icoderman.woocommerce.oauth.*;
import com.icoderman.woocommerce.*;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.BindingType;

/** Simple class to start up the application.
 *
 * @SpringBootApplication adds:
 *  @Configuration
 *  @EnableAutoConfiguration
 *  @ComponentScan
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    OAuthConfig config = new OAuthConfig("https://bikepro.com.mx/", "consumerKey", "consumerSecret");
    WooCommerce wooCommerce = new WooCommerceAPI(config);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) {


        SpringApplication.run(Application.class, args);


    }


//    @Bean
//    public CommandLineRunner run(RestTemplateBuilder builder){
//
//    }

}
