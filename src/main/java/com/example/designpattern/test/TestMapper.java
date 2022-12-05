package com.example.designpattern.test;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
@TableName("test")
public interface TestMapper extends BaseMapper<TestEntity> {

    @Select("SELECT id, user_name, address FROM test WHERE id = #{id};")
    TestEntity findEntity(@Param("id") String id);

}
