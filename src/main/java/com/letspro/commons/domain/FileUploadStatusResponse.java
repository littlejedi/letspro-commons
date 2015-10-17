package com.letspro.commons.domain;

public class FileUploadStatusResponse {
    
    private String uuid;
    
    private Long bytesUploaded;
        
    public FileUploadStatusResponse() {};
    
    public FileUploadStatusResponse(Long bytes, String uuid) {
        this.bytesUploaded = bytes;
        this.uuid = uuid;
    }
    
    public long getBytesUploaded() {
        return bytesUploaded;
    }

    public void setBytesUploaded(Long bytesUploaded) {
        this.bytesUploaded = bytesUploaded;
    }
    
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
