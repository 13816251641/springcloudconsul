package com.lujieni.cloud.domain;


import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "t_student")
@Data
@Accessors(chain = true)
public class StudentPO {

    @Column(name = "id")
    private Integer id;

    @Column(name="name")
    private String name;


    @Column(name="age")
    private Integer age;

    @Column(name="gender")
    private String gender;
}
