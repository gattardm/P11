package org.medhead.emergencysystem.apiordonnanceur;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "org.medhead.emergencysystem.apiordonnanceur")
public class CustomProperties {

    private String apiUrlIncidents;

}
