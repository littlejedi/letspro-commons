package com.letspro.commons.domain.mongodb;

import com.google.common.base.Objects;

public class DbSensorDataRecord {
        
    private String value;
    
    private String experimentId;
    
    private String sensorId;
    
    private int dataType;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public int getDataType() {
        return dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }
    
    public String getExperimentId() {
        return experimentId;
    }

    public void setExperimentId(String experimentId) {
        this.experimentId = experimentId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value, experimentId, sensorId, dataType);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof DbSensorDataRecord) {
            DbSensorDataRecord that = (DbSensorDataRecord) object;
            return Objects.equal(this.value, that.value)
                    && Objects.equal(this.experimentId, that.experimentId)
                    && Objects.equal(this.sensorId, that.sensorId)
                    && Objects.equal(this.dataType, that.dataType);
        }
        return false;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("value", value)
                .add("experimentId", experimentId).add("sensorId", sensorId)
                .add("dataType", dataType).toString();
    }
}
