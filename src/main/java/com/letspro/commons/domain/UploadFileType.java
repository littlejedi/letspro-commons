package com.letspro.commons.domain;

public enum UploadFileType {   
    
    SENSOR_DATA_UPLOAD(1);
    
    private int value;
    
    private UploadFileType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
