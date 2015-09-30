package com.letspro.commons.domain;

import java.util.Date;
import java.util.List;

import com.google.common.base.Objects;

public class Device {
	
	private Integer id;
	
	private String description;
	
	private String name;
	
	private Double latitude;
	
	private Double longtitude;
	
	private Date created;
	
	private Date updated;
	
	private List<Sensor> sensors;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(Double longtitude) {
		this.longtitude = longtitude;
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
	
	public List<Sensor> getSensors() {
		return sensors;
	}

	public void setSensors(List<Sensor> sensors) {
		this.sensors = sensors;
	}

	@Override
	public int hashCode(){
		return Objects.hashCode(id, description, name, latitude, longtitude, created, updated, sensors);
	}
	
	@Override
	public boolean equals(Object object){
		if (object instanceof Device) {
			Device that = (Device) object;
			return Objects.equal(this.id, that.id)
				&& Objects.equal(this.description, that.description)
				&& Objects.equal(this.name, that.name)
				&& Objects.equal(this.latitude, that.latitude)
				&& Objects.equal(this.longtitude, that.longtitude)
				&& Objects.equal(this.created, that.created)
				&& Objects.equal(this.updated, that.updated)
				&& Objects.equal(this.sensors, that.sensors);
		}
		return false;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("id", id)
			.add("description", description)
			.add("name", name)
			.add("latitude", latitude)
			.add("longtitude", longtitude)
			.add("created", created)
			.add("updated", updated)
			.add("sensors", sensors)
			.toString();
	}	
}
