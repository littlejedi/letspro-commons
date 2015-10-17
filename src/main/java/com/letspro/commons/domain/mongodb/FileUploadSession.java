package com.letspro.commons.domain.mongodb;

import java.util.Date;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Field;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.IndexOptions;
import org.mongodb.morphia.annotations.Indexes;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.base.Objects;
import com.letspro.commons.jackson.ObjectIdDeserializer;
import com.letspro.commons.jackson.ObjectIdSerializer;

@Entity("fileuploadsessions")
@Indexes ({
    @Index(fields = @Field("uuid"), options = @IndexOptions(name = "uuid_index"))
})
public class FileUploadSession {
    
    @JsonSerialize(using = ObjectIdSerializer.class)
    @JsonDeserialize(using = ObjectIdDeserializer.class)
    @Id
    private ObjectId id;
    
    private String uuid;
    
    private String path;
        
    private Integer fileType;
    
    private Date created;
    
    private Date updated;
    
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

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }
    
    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
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

    
}
