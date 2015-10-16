package com.letspro.commons.domain;

public class FileUploadRequest {
       
    private int fileType;
    
    /**
     * Bytes offset, indicates where the file should start being written
     */
    private long offset;

    public int getFileType() {
        return fileType;
    }

    public void setFileType(int fileType) {
        this.fileType = fileType;
    }

    public long getOffset() {
        return offset;
    }

    public void setOffset(long offset) {
        this.offset = offset;
    }
}
