package com.letspro.commons.domain.mongodb;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.letspro.commons.jackson.ObjectIdSerializer;

@Entity("schools")
public class School {
	
    @JsonSerialize(using = ObjectIdSerializer.class)
    @Id
	public ObjectId id;
	
	public String name;

	public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
