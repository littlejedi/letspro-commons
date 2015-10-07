package com.letspro.commons.utils;

import java.util.List;

import org.bson.types.ObjectId;

import com.letspro.commons.domain.SensorDataRecord;
import com.letspro.commons.domain.mongodb.DbSensorDataDocument;
import com.letspro.commons.domain.mongodb.DbSensorDataRecord;
import com.letspro.commons.domain.mongodb.Experiment;

public class SensorDataUtils {
    
    public static DbSensorDataRecord toDbSensorDataRecord(SensorDataRecord record) {
        DbSensorDataRecord db = new DbSensorDataRecord();
        db.setExperiment(new Experiment(new ObjectId(record.getExperimentId())));
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
            record.setExperimentId(r.getExperiment().getId().toString());
            record.setValue(r.getValue());
        }
        return record;
    }
}
