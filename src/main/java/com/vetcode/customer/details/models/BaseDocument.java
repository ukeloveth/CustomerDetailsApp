package com.vetcode.customer.details.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseDocument {
    @Id
    private String id;

    @CreatedDate
    @Field("createDate")
    private Date createDate;

    @LastModifiedDate
    @Field("updateDate")
    private Date updateDate;

    @Version
    private Long version; // Version field for optimistic locking

}
