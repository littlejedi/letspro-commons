package com.letspro.commons.domain.mongodb;

import java.util.Date;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.Field;
import org.mongodb.morphia.annotations.IndexOptions;
import org.mongodb.morphia.annotations.Indexes;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.letspro.commons.jackson.ObjectIdDeserializer;
import com.letspro.commons.jackson.ObjectIdSerializer;

@Entity("schools")
@Indexes ({
    @Index(fields = @Field("name"), options = @IndexOptions(name = "school_name_index", unique = true))
})
public class School {
	
    @JsonSerialize(using = ObjectIdSerializer.class)
    @JsonDeserialize(using = ObjectIdDeserializer.class)
    @Id
	private ObjectId id;
	
	private String name;
	
	private Date created;
	
	private Date updated;
	
	public School() {};
	
	public School(ObjectId id) {
	    this.id = id;
	}
	
	public School(String name) {
	    this.name = name;
	}

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
}
