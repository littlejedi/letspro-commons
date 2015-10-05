package com.letspro.commons.utils;

import org.bson.types.ObjectId;

import com.letspro.commons.domain.SensorDataRecord;
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
}
