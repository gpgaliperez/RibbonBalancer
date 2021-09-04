package com.dan.pgm.ribbonbalancer;

import com.dan.pgm.ribbonbalancer.config.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@EnableDiscoveryClient
@SpringBootApplication
@RibbonClient(configuration = RibbonConfiguration.class)
public class RibbonBalancerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonBalancerApplication.class, args);
    }

}
