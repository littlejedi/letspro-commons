package com.letspro.commons.domain;

public enum FileUploadStatus {
    
    NOT_STARTED(0),
    IN_PROGRESS(1),
    FINISHED(2),
    INTERNAL_ERROR(3);
    
    private int value;
     
    private FileUploadStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
