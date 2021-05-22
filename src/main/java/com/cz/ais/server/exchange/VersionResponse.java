package com.cz.ais.server.exchange;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class VersionResponse {

    private String version;

    private String buildTimestampLabel;
}
