package com.utopia.mapper;

import com.utopia.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 部门管理
 */
@Mapper
public interface DeptMapper {
    /**
     *
     * */
    @Select("select * from dept")
    List<Dept> list();
}
