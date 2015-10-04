package com.letspro.commons.domain.mongodb;

public class SensorDataRecord {
    
    private String value;
    
    private int dataType;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getDataType() {
        return dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }
}
