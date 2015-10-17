package com.letspro.commons.domain;

public class FileUploadRequest {
       
    /**
     * Indicates the type of the file being uploaded
     */
    private int fileType;
    
    /**
     * Length of the file in bytes
     */
    private long length;
    
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

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }
}
