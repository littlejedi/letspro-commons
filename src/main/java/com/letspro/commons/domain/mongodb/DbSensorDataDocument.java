package com.letspro.commons.domain.mongodb;

import java.util.List;

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
    
    // Should be milliseconds since Epoch
    @Id
    private Long timestampInMs;
    
    @Embedded
    private List<DbSensorDataRecord> records;
    
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
}
