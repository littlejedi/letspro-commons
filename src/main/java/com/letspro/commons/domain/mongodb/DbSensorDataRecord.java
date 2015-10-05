package com.letspro.commons.domain.mongodb;

import org.mongodb.morphia.annotations.Reference;

public class DbSensorDataRecord {
        
    private String value;
    
    @Reference
    private Experiment experiment;
    
    private String sensorId;
    
    private int dataType;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    public Experiment getExperiment() {
        return experiment;
    }

    public void setExperiment(Experiment experiment) {
        this.experiment = experiment;
    }
    
    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public int getDataType() {
        return dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }
}
