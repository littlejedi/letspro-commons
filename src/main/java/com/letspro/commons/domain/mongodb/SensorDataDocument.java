package com.letspro.commons.domain.mongodb;

import java.util.List;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("sensordatadocs")
public class SensorDataDocument {
    
    // Should be milliseconds since Epoch
    @Id
    private Long id;
    
    @Embedded
    private List<SensorDataRecord> records;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<SensorDataRecord> getRecords() {
        return records;
    }

    public void setRecords(List<SensorDataRecord> records) {
        this.records = records;
    }
}
