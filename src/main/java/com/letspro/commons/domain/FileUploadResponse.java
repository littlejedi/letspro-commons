package com.letspro.commons.domain;

import com.google.common.base.Objects;

public class FileUploadResponse {
    
    private String sessionUuid;
    
    private int bytesUploaded;

    public String getSessionUuid() {
        return sessionUuid;
    }

    public void setSessionUuid(String sessionUuid) {
        this.sessionUuid = sessionUuid;
    }

    public int getBytesUploaded() {
        return bytesUploaded;
    }

    public void setBytesUploaded(int bytesUploaded) {
        this.bytesUploaded = bytesUploaded;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(sessionUuid, bytesUploaded);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof FileUploadResponse) {
            FileUploadResponse that = (FileUploadResponse) object;
            return Objects.equal(this.sessionUuid, that.sessionUuid)
                    && Objects.equal(this.bytesUploaded, that.bytesUploaded);
        }
        return false;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("sessionUuid", sessionUuid)
                .add("bytesUploaded", bytesUploaded).toString();
    }
}
