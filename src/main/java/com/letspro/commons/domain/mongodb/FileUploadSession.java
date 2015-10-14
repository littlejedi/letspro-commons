package com.letspro.commons.domain.mongodb;

import java.util.Date;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Field;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.IndexOptions;
import org.mongodb.morphia.annotations.Indexes;

import com.google.common.base.Objects;

@Entity("fileuploadsessions")
@Indexes ({
    @Index(fields = @Field("uuid"), options = @IndexOptions(name = "uuid_index"))
})
public class FileUploadSession {
    
    private ObjectId id;
    
    private String uuid;
    
    private String path;
    
    private int fileType;
    
    private Date created;
    
    private Date statusRequested;
    
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getFileType() {
        return fileType;
    }

    public void setFileType(int fileType) {
        this.fileType = fileType;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getStatusRequested() {
        return statusRequested;
    }

    public void setStatusRequested(Date statusRequested) {
        this.statusRequested = statusRequested;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, uuid, path, fileType, created,
                statusRequested);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof FileUploadSession) {
            FileUploadSession that = (FileUploadSession) object;
            return Objects.equal(this.id, that.id)
                    && Objects.equal(this.uuid, that.uuid)
                    && Objects.equal(this.path, that.path)
                    && Objects.equal(this.fileType, that.fileType)
                    && Objects.equal(this.created, that.created)
                    && Objects
                            .equal(this.statusRequested, that.statusRequested);
        }
        return false;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("id", id).add("uuid", uuid)
                .add("path", path).add("fileType", fileType)
                .add("created", created)
                .add("statusRequested", statusRequested).toString();
    }
}
