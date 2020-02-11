package com.lujieni.cloud.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ODS_USER")
@Entity
@Data
public class OdsUser {
    @Id
    private Integer id;

    private String username;

    private String password;

}