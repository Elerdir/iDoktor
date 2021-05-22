package com.cz.ais.util;

import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Getter
@Component
@PropertySource("classpath:idoktor-${spring.profiles.active}.properties")
public class IDoktorProperties {

    private static Logger logger = LoggerFactory.getLogger(IDoktorProperties.class);

    @Value("@project.version@")
    private String version;

    @Value("@buildTimestampLabel@")
    private String buildTimestampLabel;
}
