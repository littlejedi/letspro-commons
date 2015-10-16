package com.letspro.commons.domain;

public class FileUploadStatusResponse {
    
    private String filename;
    
    private long bytesUploaded;
    
    private int status;
    
    public FileUploadStatusResponse() {};
    
    public FileUploadStatusResponse(FileUploadStatus status) {
        this.status = status.getValue();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public long getBytesUploaded() {
        return bytesUploaded;
    }

    public void setBytesUploaded(long bytesUploaded) {
        this.bytesUploaded = bytesUploaded;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
