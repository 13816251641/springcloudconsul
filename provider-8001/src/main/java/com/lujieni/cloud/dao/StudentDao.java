package com.lujieni.cloud.dao;

import com.lujieni.cloud.domain.StudentPO;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface StudentDao extends Mapper<StudentPO> {

}
