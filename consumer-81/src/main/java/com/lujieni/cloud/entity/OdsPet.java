package com.lujieni.cloud.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ODS_PET")
@Entity
@Data
public class OdsPet {
    @Id
    private Long id;

    private String name;

    private String kind;

}