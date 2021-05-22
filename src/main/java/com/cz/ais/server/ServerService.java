package com.cz.ais.server;

import com.cz.ais.server.exchange.VersionResponse;
import com.cz.ais.util.IDoktorProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServerService {

    @Autowired
    private IDoktorProperties iDoktorProperties;

    public VersionResponse getVersion() {
        return VersionResponse.builder()
                .version(iDoktorProperties.getVersion())
                .buildTimestampLabel(iDoktorProperties.getBuildTimestampLabel())
                .build();
    }
}
