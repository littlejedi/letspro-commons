package com.letspro.commons.domain;

import java.util.Date;

import com.google.common.base.Objects;

public class Sensor {
	
	private Integer id;
	
	private Device device;
	
	private SensorType type;
	
	private String name;
	
	private String description;
	
	private Date created;
	
	private Date updated;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}
	
	public Integer getDeviceId() {
		if (this.device == null) {
			return null;
		}
		return this.device.getId();
	}
	
	/**
	 * This will assign the sensor to a new device, use CAREFULLY!
	 * @param deviceId
	 */
	public void setDeviceId(Integer deviceId) {
		this.device = new Device();
		this.device.setId(deviceId);
	}

	public SensorType getType() {
		return type;
	}

	public void setType(SensorType type) {
		this.type = type;
	}

	@Override
	public int hashCode(){
		return Objects.hashCode(id, device, type, name, description, created, updated);
	}
	
	@Override
	public boolean equals(Object object){
		if (object instanceof Sensor) {
			Sensor that = (Sensor) object;
			return Objects.equal(this.id, that.id)
				&& Objects.equal(this.device, that.device)
				&& Objects.equal(this.type, that.type)
				&& Objects.equal(this.name, that.name)
				&& Objects.equal(this.description, that.description)
				&& Objects.equal(this.created, that.created)
				&& Objects.equal(this.updated, that.updated);
		}
		return false;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("id", id)
			.add("device", device)
			.add("type", type)
			.add("name", name)
			.add("description", description)
			.add("created", created)
			.add("updated", updated)
			.toString();
	}
}
