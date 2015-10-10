package com.letspro.commons.utils;

import java.util.List;

import org.bson.Document;

import com.letspro.commons.domain.SensorDataRecord;
import com.letspro.commons.domain.mongodb.DbSensorDataDocument;
import com.letspro.commons.domain.mongodb.DbSensorDataRecord;

public class SensorDataUtils {
    
    public static DbSensorDataRecord toDbSensorDataRecord(SensorDataRecord record) {
        DbSensorDataRecord db = new DbSensorDataRecord();
        db.setExperimentId(record.getExperimentId());
        db.setValue(record.getValue());
        db.setSensorId(record.getSensorId());
        db.setDataType(record.getDataType());
        return db;
    }
    
    public static SensorDataRecord flattenSensorDataDocument(DbSensorDataDocument doc) {
        SensorDataRecord record = new SensorDataRecord();
        record.setTimestampInMs(doc.getTimestampInMs());
        List<DbSensorDataRecord> list = doc.getRecords();
        if (list != null && list.size() == 1) {
            DbSensorDataRecord r = list.get(0);
            record.setSensorId(r.getSensorId());
            record.setDataType(r.getDataType());
            record.setExperimentId(r.getExperimentId());
            record.setValue(r.getValue());
        }
        return record;
    }
    
    public static SensorDataRecord flattenBsonSensorDataDocument(Document doc) {
        SensorDataRecord record = new SensorDataRecord();
        record.setTimestampInMs(doc.getLong("_id"));
        Document records = (Document)doc.get("records");
        if (records != null) {
            record.setSensorId(records.getString("sensorId"));
            record.setDataType(records.getInteger("dataType"));
            record.setExperimentId(records.getString("experimentId"));
            record.setValue(records.getString("value"));
        }
        return record;
    }
}
