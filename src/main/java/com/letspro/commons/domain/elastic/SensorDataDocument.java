package com.letspro.commons.domain.elastic;

import com.google.common.base.Objects;

public class SensorDataDocument {
    
    private long timestamp;

    private String sensorId;
    
    private String experimentId;
    
    private int dataType;

    private String value;
   
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(sensorId, dataType, experimentId, value,
                timestamp);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof SensorDataDocument) {
            SensorDataDocument that = (SensorDataDocument) object;
            return Objects.equal(this.sensorId, that.sensorId)
                    && Objects.equal(this.dataType, that.dataType)
                    && Objects.equal(this.experimentId, that.experimentId)
                    && Objects.equal(this.value, that.value)
                    && Objects.equal(this.timestamp, that.timestamp);
        }
        return false;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("sensorId", sensorId)
                .add("dataType", dataType).add("experimentId", experimentId)
                .add("value", value).add("timestamp", timestamp).toString();
    }
}
