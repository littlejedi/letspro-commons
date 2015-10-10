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
import com.google.common.base.Objects;

@Entity("sensordatadocs")
@Indexes ({
    @Index(fields = @Field("timestampInMs"), options = @IndexOptions(name = "timestamp_ms_index"))
})
public class DbSensorDataDocument {
    
    @Id
    // Should be milliseconds since Epoch
    private Long timestampInMs;
    
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

    @Override
    public int hashCode() {
        return Objects.hashCode(timestampInMs, records, created, updated);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof DbSensorDataDocument) {
            DbSensorDataDocument that = (DbSensorDataDocument) object;
            return Objects.equal(this.timestampInMs, that.timestampInMs)
                    && Objects.equal(this.records, that.records)
                    && Objects.equal(this.created, that.created)
                    && Objects.equal(this.updated, that.updated);
        }
        return false;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("timestampInMs", timestampInMs)
                .add("records", records).add("created", created)
                .add("updated", updated).toString();
    }
}
