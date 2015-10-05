package com.letspro.commons.domain;

public class SensorDataRecord {
    
    private long timestampInMs;
    
    private String sensorId;
    
    private String value;
    
    private String experimentId;
    
    private int dataType;

    public long getTimestampInMs() {
        return timestampInMs;
    }

    public void setTimestampInMs(long timestampInMs) {
        this.timestampInMs = timestampInMs;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getExperimentId() {
        return experimentId;
    }

    public void setExperimentId(String experimentId) {
        this.experimentId = experimentId;
    }

    public int getDataType() {
        return dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }
}
