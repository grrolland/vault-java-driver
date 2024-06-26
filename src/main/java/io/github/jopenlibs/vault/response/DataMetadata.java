package io.github.jopenlibs.vault.response;

import java.util.Collections;
import java.util.Map;

/**
 * Container for metadata that can be returned with a logical operation response
 */
public class DataMetadata {

    public static final String VERSION_KEY = "version";

    private final Map<String, String> metadataMap;

    public DataMetadata(Map<String, String> metadataMap) {
        this.metadataMap = metadataMap;
    }

    public Long getVersion() {
        final String versionString = metadataMap.get(VERSION_KEY);
        return (null != versionString) ? Long.valueOf(versionString) : null;
    }

    public Map<String, String> getMetadataMap() {
        return Collections.unmodifiableMap(metadataMap);
    }

    public boolean isEmpty() {
        return metadataMap.isEmpty();
    }

}
