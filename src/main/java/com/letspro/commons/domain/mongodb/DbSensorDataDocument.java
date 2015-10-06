package com.letspro.commons.domain.mongodb;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Field;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.IndexOptions;
import org.mongodb.morphia.annotations.Indexes;

@Entity("sensordatadocs")
@Indexes ({
    @Index(fields = @Field("timestampInMs"), options = @IndexOptions(name = "timestamp_ms_index"))
})
public class DbSensorDataDocument {
    
    @Id
    // Should be milliseconds since Epoch
    private Long timestampInMs;
    
    @Embedded
    private List<DbSensorDataRecord> records;
    
    private Date created;
    
    private Date updated;
    
    public Long getTimestampInMs() {
        return timestampInMs;
    }

    public void setTimestampInMs(Long timestampInMs) {
        this.timestampInMs = timestampInMs;
    }

    public List<DbSensorDataRecord> getRecords() {
        return records;
    }

    public void setRecords(List<DbSensorDataRecord> records) {
        this.records = records;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
